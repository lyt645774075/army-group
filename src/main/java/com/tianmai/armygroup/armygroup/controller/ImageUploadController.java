/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.tianmai.armygroup.armygroup.controller;

import com.aliyun.oss.OSSClient;
import com.google.common.collect.Maps;
import net.coobird.thumbnailator.Thumbnails;
import org.springframework.http.MediaType;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/**
 * @author yangtao.lyt
 * @version $Id: ImageUploadController.java, v 0.1 2019年03月03日 21:36 yangtao.lyt Exp $
 */
@RestController
public class ImageUploadController {
    private final static String BUCKET_NAME = "freturn";

    /** 上传图片最大宽度 */
    private final static Float MAX_WIDTH = 1200f;

    /** 图片地址前缀 */
    private final static String IMAGE_URL_PRE = "http://freturn.oss-cn-hangzhou.aliyuncs.com/img/";

    private static String endpoint = "http://oss-cn-hangzhou.aliyuncs.com";
    private static String accessKeyId = "LTAIeju9FA2FO5vq";
    private static String accessKeySecret = "D15W5MuItE1t6P2JidfmiseMkPXFyA";

    private static OSSClient ossClient;


    static {

        ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
    }

    @RequestMapping(value = "/upload.json")
    public Map<String,String> imageUpload(@RequestParam MultipartFile file) {

        Map<String, String> dataMap = Maps.newHashMap();

        try {
            /*
             * 使用图片md5作为文件名
             */
            //String fileName = DigestUtils.md5Hex(file.getInputStream()) + ".jpg";
            String fileName = file.getOriginalFilename();
            /*
             * 先判断文件是否已经存在,去重
             */
            boolean exist = ossClient.doesObjectExist(BUCKET_NAME, fileName);

            if(!exist){
                ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                BufferedImage image = ImageIO.read(file.getInputStream());
                Float scale = MAX_WIDTH / image.getWidth() > 1f ? 1f : MAX_WIDTH / image.getWidth();

                Thumbnails.of(file.getInputStream()).scale(scale).outputQuality(0.9f).outputFormat("jpg").toOutputStream(outputStream);

                ossClient.putObject(BUCKET_NAME, fileName, new ByteArrayInputStream(outputStream.toByteArray()));
            }

            dataMap.put("url", IMAGE_URL_PRE + fileName);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return dataMap;
    }

}