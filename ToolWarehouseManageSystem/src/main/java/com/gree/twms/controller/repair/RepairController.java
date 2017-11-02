package com.gree.twms.controller.repair;

import com.github.pagehelper.PageInfo;
import com.gree.twms.pojo.Repair;
import com.gree.twms.service.IRepairService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("/twms")
@Controller
public class RepairController {
    
    @Autowired
    private IRepairService repairService;

    @RequestMapping("/addRepair")
    public String addRepair(Repair repair, MultipartFile file, HttpServletRequest request){
        String msg="";
        if(repairService.insertSelective(repair)==1){
            msg = "提交成功！";
        }else {
            msg = "提交失败！请重试";
        }
        request.setAttribute("msg",msg);
        return "tool-repair";
    }

    //单个删除
    @RequestMapping("/deleteRepair")
    public String deleteRepair(HttpServletRequest request,Integer id){
        String msg = "";
        if(id!=null){
            int result = repairService.deleteByPrimaryKey(id);
            if(result == 1){
                msg = "删除成功！";
            }else {
                msg ="删除失败！";
            }
        }
        return searchRepair(request,null,null,null,msg);
    }

    //批量删除
    @ResponseBody
    @RequestMapping("/delCheckedRepair")
    public Map<Object,Object> delCheckedRepair(int[] checkID){
        String msg = "";
        Map<Object,Object> resultMap=new HashMap<Object,Object>();
        int success = 0;
        int fail = 0;
        if(checkID!=null) {
            for (int i = 0; i < checkID.length; i++) {

                if (repairService.deleteByPrimaryKey(checkID[i]) == 1) {
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
    //查询
    @RequestMapping("/searchRepair")
    public String searchRepair(HttpServletRequest request, String conditions, String keywords, Integer pageNum, String msg){
        PageInfo<Repair> pageInfo=repairService.conditionQueryPage(pageNum,conditions,keywords );
        request.setAttribute("pageInfo",pageInfo);
        request.setAttribute("repairs",pageInfo.getList());
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
        return "repair-account";
    }
}
