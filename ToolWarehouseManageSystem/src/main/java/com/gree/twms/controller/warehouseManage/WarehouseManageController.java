package com.gree.twms.controller.warehouseManage;

import com.github.pagehelper.PageInfo;
import com.gree.twms.pojo.User;
import com.gree.twms.pojo.Warehouse;
import com.gree.twms.service.IWarehouseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


@Controller
public class WarehouseManageController {
    @Autowired
    private IWarehouseService warehouseService;

    @RequestMapping("/importWarehouse")
    public String importWarehouse(HttpServletRequest request,MultipartFile file){
        Warehouse warehouse = new Warehouse();
        String msg = "";
        int result = 0;
        if(file.getOriginalFilename().endsWith(".xlsx")){
            msg = "系统不支持excel-2007（以.xlsx结尾的文件)格式，\\n 请使用excel 97-2003（以.xls结尾的文件）";
            request.setAttribute("msg",msg);
        }else if(file.getOriginalFilename().endsWith(".xls")) {
            try {
                //也可以用request获取上传文件
                //MultipartFile  fileFile = request.getFile("file"); //这里是页面的name属性
                //转换成输入流
                InputStream is = file.getInputStream();
                //得到excel
                Workbook workbook = Workbook.getWorkbook(is);
                //得到sheet
                Sheet sheet = workbook.getSheet(0);
                //得到列数
                int colsNum = sheet.getColumns();
                //得到行数
                int rowsNum = sheet.getRows();
                //单元格
                Cell cell;
                Map<Integer, String> map = new HashMap<Integer, String>();
                for (int i = 1; i < rowsNum; i++) {//第一行是标题,所以 i从1开始
                    for (int j = 0; j < colsNum; j++) {
                        cell = sheet.getCell(j, i);//第一个参数是列.第二个参数是行
                        map.put(j, cell.getContents());
                    }

                    warehouse.setSid(map.get(0));
                    warehouse.setTid(map.get(1));
                    warehouse.setSite(map.get(2));
                    warehouse.setState(map.get(3));
                    try {
                        if(warehouseService.countByPid(warehouse.getSid()) == 0){
                            result += warehouseService.insertSelective(warehouse);
                        }else {
                            msg += "货架编号为:" + warehouse.getSid() +"的货架已经存在!\\n";
                            continue;
                        }
                    } catch (Exception e) {
                        msg = "数据库插入异常！";
                        return searchWarehouse(request,null,null,null,msg);
                    }
                }

                msg += "成功导入" + result + "条信息，失败" + (rowsNum - result - 1) + "条!";

            } catch (IOException e) {
                e.printStackTrace();
            } catch (BiffException e) {
                e.printStackTrace();
            }
        }
        return searchWarehouse(request,null,null,null,msg);
    }

    @RequestMapping("/searchWarehouse")
    public  String searchWarehouse(HttpServletRequest request,String conditions, String keywords,Integer pageNum,String msg){
        PageInfo<Warehouse> pageInfo=warehouseService.conditionQueryPage(pageNum,conditions,keywords );
        request.setAttribute("pageInfo",pageInfo);
        request.setAttribute("wh",pageInfo.getList());
        request.setAttribute("conditions",conditions);
        request.setAttribute("keywords",keywords);
        if(pageInfo.getList().isEmpty()){
            if(msg==null){
                msg = "没有查询到数据！";
            }else{
                msg +="\\n没有查询到数据！";
            }

        }
        request.setAttribute("msg",msg);
        return "warehouse-manage";
    }

    @RequestMapping("/deleteWarehouse")
    public String deleteWarehouse(HttpServletRequest request,String sid){
        String msg = "";
        if(sid != ""&&sid != null){
            int result = warehouseService.deleteByPrimaryKey(sid);
            if(result == 1){
                msg = "删除成功！";
            }else {
                msg ="删除失败！";
            }
        }
        return searchWarehouse(request,null,null,null,msg);
    }

    @ResponseBody
    @RequestMapping("/delCheckedWarehouse")
    public  Map<Object,Object> delCheckedWarehouse(String[] checkID){
        String msg = "";
        Map<Object,Object> resultMap=new HashMap<Object,Object>();
        int success = 0;
        int fail = 0;
        if(checkID!=null) {
            for (int i = 0; i < checkID.length; i++) {

                if (warehouseService.deleteByPrimaryKey(checkID[i]) == 1) {
                    success++;
                } else {
                    fail++;
                }
            }
        }
        msg="成功删除" + success + "条记录，失败" + fail + "条记录！";
        resultMap.put("success",true);
        resultMap.put("msg",msg);
        return resultMap;
    }

    @RequestMapping("/editWarehouse")
    public String editWarehouse(HttpServletRequest request,Warehouse warehouse) {
        String msg = "";
        User loginUser = (User) request.getSession().getAttribute("userInfo");
        if(loginUser.getRoleid()==1||loginUser.getRoleid()==2){
            if(warehouse.getTid().equals("")){
                msg = "当前货架没有存储工装，无法更改状态！";
            }else {
                if (warehouse.getState().equals("空库")) {
                    warehouse.setTid("");
                }
                if (warehouseService.updateByPid(warehouse) == 1) {
                    msg = "修改成功！";
                } else {
                    msg = "修改失败！";
                }
            }
        }else{
            msg = "您的管理权限不够，请与管理员联系！";
        }

        return searchWarehouse(request,null,null,null,msg);
    }
}
