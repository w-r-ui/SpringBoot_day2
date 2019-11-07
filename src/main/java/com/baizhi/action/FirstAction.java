package com.baizhi.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;

@Controller
@RequestMapping("/upload")
public class FirstAction {
    @RequestMapping("/u")
    public String u(MultipartFile upload, HttpSession session) throws Exception {
        //获取文件上传文件夹的绝对路径
        String realPath = session.getServletContext().getRealPath("/upload");
        //在目标文件下创建一个与上传文件同名的空文件
        File file = new File(realPath + "/" + upload.getOriginalFilename());
        //把接受的文件传输到空文件中
        upload.transferTo(file);
        return "index";
    }
}
