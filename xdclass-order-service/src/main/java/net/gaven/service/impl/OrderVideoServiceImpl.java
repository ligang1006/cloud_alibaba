package net.gaven.service.impl;

import net.gaven.Video;
import net.gaven.VideoOrder;
import net.gaven.service.IOrderService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author: lee
 * @create: 2021/7/23 12:27 下午
 **/
@Service
public class OrderVideoServiceImpl implements IOrderService {
    @Value("${video.url}")
    private String videoUrl;
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public VideoOrder getVideo(int videoId) {
        String url = videoUrl + "?videoId=" + videoId;
        Video video = restTemplate.getForObject(url, Video.class);
        System.out.println(video);
        if (video != null) {
            VideoOrder videoOrder = new VideoOrder();
            videoOrder.setVideoId(video.getId());
            videoOrder.setVideoImg(video.getCoverImg());
            videoOrder.setVideoTitle(video.getTitle());
            videoOrder.setTotalFee(video.getPrice());
            return videoOrder;
        }
        return null;
    }
}
