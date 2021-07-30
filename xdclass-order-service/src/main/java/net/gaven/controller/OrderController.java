package net.gaven.controller;

import net.gaven.Video;
import net.gaven.VideoOrder;
import net.gaven.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author: lee
 * @create: 2021/7/23 10:59 上午
 **/
@RestController
@RequestMapping("/api/v1/video_order")
public class OrderController {
    @Autowired
    private IOrderService orderService;

    @GetMapping("get")
    public VideoOrder getVideoOrder(int videoId) {
        return orderService.getVideo(videoId);
    }
}
