package com.zj.springbootfastdfs.controller;

import com.sun.media.sound.SoftTuning;
import com.zj.springbootfastdfs.entity.File;
import com.zj.springbootfastdfs.service.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.List;

/**
 * @author zhoujian
 */

@org.springframework.stereotype.Controller
public class Controller {
    @Resource
    Service service;

    @RequestMapping("/")
    public ModelAndView testWeb(){
        List<File> files =  service.findAllFilesService();
        ModelAndView modelAndView = new ModelAndView("Hello");
        modelAndView.addObject("files",files);
        return modelAndView;
    }

    @RequestMapping("/upload/{id}")
    public ModelAndView upLoadFile(@PathVariable String id){
        System.out.println(id + "=================");
        ModelAndView upload = new ModelAndView("Upload");
        return upload.addObject("id", id);
    }

    @PostMapping("/upload")
    public String upLoad( String id , MultipartFile multipartFile) throws IOException {
        System.out.println(id);
        System.out.println(multipartFile.isEmpty());
        System.out.println(multipartFile.getOriginalFilename());
        System.out.println(multipartFile.getSize());
        System.out.println(multipartFile.getBytes());
        System.out.println(multipartFile.getContentType());
        System.out.println(multipartFile.getResource());
        return "Upload";
    }
}

