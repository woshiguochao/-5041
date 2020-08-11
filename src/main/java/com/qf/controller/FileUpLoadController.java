package com.qf.controller;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by DELL on 2019/8/7.
 */
@Controller
@RequestMapping("fileUpAndDown")
public class FileUpLoadController {
    static String UPLOAD_PATH = "/static/upload/";
    @RequestMapping("upload")
    @ResponseBody
    public void  upload(MultipartFile dropzFile, HttpServletRequest request, HttpSession session) throws IOException {
        //创建文件需要存储的路径
        String destPathName = request.getSession().getServletContext().getRealPath("/static/upload");
        File destPath = new File(destPathName);
        //如果目标文件夹不存在我就创建它
        if(!destPath.exists()){
            destPath.mkdirs();
        }
        //获取文件的后缀名
        String fileSuffix = dropzFile.getOriginalFilename().substring(dropzFile.getOriginalFilename().lastIndexOf("."));

        String destFileName = UUID.randomUUID()+fileSuffix;
        System.out.println(destFileName);
        File destFile = new File(destPath,destFileName);
        if(!destFile.exists()){
            destFile.createNewFile();
        }
        dropzFile.transferTo(destFile);
        String url ="http://localhost:8080/static/upload/"+destFileName;
        session.setAttribute("url",url);
    }
    
}