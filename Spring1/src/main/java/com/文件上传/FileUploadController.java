package com.文件上传;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.logging.logback.LogbackLoggingSystem;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @Author: wangxuefeng@hsgene.com
 * @Description:
 * @Date: Created in 10:13 2018/3/12
 * @Modified By:
 */
@Controller
@RequestMapping("/v1")
public class FileUploadController
{
    @Value("${server.port}")
    private String port;

    @Value("${logging.config}")
    private String config;

    @RequestMapping(value = {"/test"}, method = RequestMethod.GET)
    public void test()
    {
        System.out.println(port + "........" + config);
    }

    @RequestMapping(value = {"/upload"}, method = RequestMethod.GET)
    public @ResponseBody
    String upload(MultipartFile file)
    {
        try
        {
            FileUtils.writeByteArrayToFile(new File("C:/wxf/es/" + file.getOriginalFilename()), file.getBytes());
            return "ok";
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return "error";
    }
}
