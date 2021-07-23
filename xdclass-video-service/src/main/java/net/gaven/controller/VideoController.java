package net.gaven.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lee
 * @create: 2021/7/23 8:49 上午
 **/
@RestController
@RequestMapping("/api/v1/video")
public class VideoController {
    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
