package com.gree.twms.controller.Account;

import com.github.pagehelper.PageInfo;
import com.gree.twms.pojo.Account;
import com.gree.twms.service.IAccountService;

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
public class IOAccountController {

    @Autowired
    private IAccountService accountService;

    //导入
    @RequestMapping("/importAccounts")
    public String importAccounts(HttpServletRequest request, MultipartFile file){
        Account account = new Account();
        String msg = "";
        int result = 0;
        if(file.getOriginalFilename().endsWith(".xlsx")){
            msg = "系统不支持excel-2007（以.xlsx结尾的文件)格式，请使用excel 97-2003（以.xls结尾的文件）";
            request.setAttribute("msg",msg);
            System.out.println(msg);
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

                    account.setTid(map.get(0));
                    account.setTname(map.get(1));
                    account.setTmodel(map.get(2));
                    account.setVersionnum(map.get(3));
                    account.setTeam(map.get(4));
                    account.setPname(map.get(5));
                    account.setBorrowtime(map.get(6));
                    account.setReturntime(map.get(7));
                    try {
                        result += accountService.insertSelective(account);
                    } catch (Exception e) {
                        msg = "数据库插入异常！";
                        System.out.println(msg);
                        return searchAccount(request,null,null,null,msg);
                    }
                }

                msg += "成功导入" + result + "条信息，失败" + (rowsNum - result - 1) + "条!";

            } catch (IOException e) {
                e.printStackTrace();
            } catch (BiffException e) {
                e.printStackTrace();
            }
        }
        return searchAccount(request,null,null,null,msg);
    }

    //单个删除用户信息
    @RequestMapping("/deleteAccount")
    public String deleteAccount(HttpServletRequest request,Integer id){
        String msg = "";
        if(id!=null){
            int result = accountService.deleteByPrimaryKey(id);
            if(result == 1){
                msg = "删除成功！";
            }else {
                msg ="删除失败！";
            }
        }
        return searchAccount(request,null,null,null,msg);
    }

    //批量删除用户
    @ResponseBody
    @RequestMapping("/delCheckedAccount")
    public  Map<Object,Object> delCheckedAccount(int[] checkID){
        String msg = "";
        Map<Object,Object> resultMap=new HashMap<Object,Object>();
        int success = 0;
        int fail = 0;
        if(checkID!=null) {
            for (int i = 0; i < checkID.length; i++) {

                if (accountService.deleteByPrimaryKey(checkID[i]) == 1) {
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
    //查询用户
    @RequestMapping("/searchAccount")
    public String searchAccount(HttpServletRequest request, String conditions, String keywords,Integer pageNum,String msg){
        PageInfo<Account> pageInfo=accountService.conditionQueryPage(pageNum,conditions,keywords );
        request.setAttribute("pageInfo",pageInfo);
        request.setAttribute("accounts",pageInfo.getList());
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
        return "IO-account";
    }

}
