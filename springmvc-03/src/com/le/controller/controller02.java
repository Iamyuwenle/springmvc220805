package com.le.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.function.ServerRequest;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

@Controller
public class controller02 {

    @RequestMapping("/download")
    public ResponseEntity<byte[]> hello01(HttpSession session) {

        //数据体
        ServletContext context = session.getServletContext();
        InputStream inputStream = context.getResourceAsStream("/resources/img/llz.jpg");
        byte[] bytes = new byte[0];
        try {
            bytes = new byte[inputStream.available()];
            inputStream.read(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //响应头Content-Disposition
        HttpHeaders headers = new HttpHeaders();
        //response.setHeader("Content-disposition", "attachment;filename=" +filename);
        headers.add("Content-Disposition", "attachment;filename=llz.jpg");

        //状态码
        HttpStatus status = HttpStatus.OK;

        ResponseEntity<byte[]> responseEntity = new ResponseEntity<byte[]>(bytes, headers, status);
        return responseEntity;
    }

    @ResponseBody
    @RequestMapping("/upload")
    public String hello02(@RequestParam("pic") MultipartFile mpf,
                          @RequestParam String desc,
                          HttpSession session) {

        //拿上传的文件名
        String filename = mpf.getOriginalFilename();
        //处理文件名重复问题
        int index = filename.lastIndexOf(".");
        String suffix = filename.substring(index);
        filename = UUID.randomUUID().toString() + suffix;

        //拿到文件保存的磁盘路径
        ServletContext context = session.getServletContext();
        String dirPath = context.getRealPath("/resources/upload");
        String filePath = dirPath + "/" + filename;

        //创建File对象表示文件保存到磁盘的文件
        File file = new File(filePath);

        try {
            mpf.transferTo(file);
            return "ok";
        } catch (IOException e) {
            return "error";
        }
    }
}
