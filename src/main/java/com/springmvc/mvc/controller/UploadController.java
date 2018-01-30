package com.springmvc.mvc.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * Created by lixy3 on 18-1-24.
 */
@Controller
@RequestMapping("/upload")
public class UploadController {

    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public String showUpload() {
        return "upload/show";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveUpload(@RequestParam("file") MultipartFile mf, Model model) throws IOException {
        String fname = "";
        if (! mf.isEmpty()) {
            fname = mf.getOriginalFilename();
            System.out.println(fname);
            FileUtils.copyInputStreamToFile(mf.getInputStream(), new File("mvc_upload/", System.currentTimeMillis() + "_" + fname));
        }

        model.addAttribute("filename", fname);

        return "upload/success";
    }
}
