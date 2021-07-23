package net.gaven.controller;

import net.gaven.Video;
import net.gaven.service.IVideoService;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private IVideoService videoService;

    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @GetMapping("/find_by_id")
    public Video findById(int videoId) {
        return videoService.findById(videoId);
    }
}
