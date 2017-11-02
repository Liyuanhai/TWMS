package com.gree.twms.tool;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FileOperations {


    public static void downFile(String filePath,HttpServletResponse response,HttpServletRequest request) {
        try {
            // 得到要下载的文件
            File file = new File(filePath);

            // 如果文件不存在
            if (!file.exists()) {
                request.setAttribute("msg", "文件不存在！");
                return;
            }
            // 处理文件名
            String realname = filePath.substring(filePath.lastIndexOf("/") + 1);
            // 设置响应头，控制浏览器下载该文件
            response.setHeader("content-disposition", "attachment;filename=" + new String( realname.getBytes("utf-8"), "ISO8859-1" ));
            // 读取要下载的文件，保存到文件输入流
            FileInputStream in = new FileInputStream(filePath);
            // 创建输出流
            OutputStream out = response.getOutputStream();
            // 创建缓冲区
            byte buffer[] = new byte[1024];
            int len = 0;
            // 循环将输入流中的内容读取到缓冲区当中
            while ((len = in.read(buffer)) > 0) {
                // 输出缓冲区的内容到浏览器，实现文件下载
                out.write(buffer, 0, len);
            }
            // 关闭文件输入流
            in.close();
            // 关闭输出流
            out.close();
        } catch (Exception e) {
            System.out.println("系统错误！");

            request.setAttribute("msg", "系统错误！");
        }

    }


    public static int delFile(String filePath){
        // 得到要下载的文件
        File file = new File(filePath);

        // 如果文件不存在
        if (!file.exists()) {
            return -1;
        }else {
            try {
                if(file.delete()){
                    return 1;
                }else{

                    return 0;
                }
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                System.out.println("系统错误！");
            }

        }
        return 0;
    }
}
