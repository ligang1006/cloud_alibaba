package net.gaven.service.impl;

import net.gaven.Video;
import net.gaven.VideoOrder;
import net.gaven.service.IOpenFeignOrderService;
import net.gaven.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author: lee
 * @create: 2021/7/23 12:27 下午
 **/
@Service
@RefreshScope
public class OrderVideoServiceImpl implements IOrderService {
    @Value("${order.name}")
    private String userName;

    @Autowired
    private IOpenFeignOrderService feignService;
    @Override
    public VideoOrder getVideo(int videoId) {
        Video video = feignService.findById(videoId);
        System.out.println(video);
        if (video != null) {
            VideoOrder videoOrder = new VideoOrder();
            videoOrder.setVideoId(video.getId());
            videoOrder.setVideoImg(video.getCoverImg());
            videoOrder.setVideoTitle(video.getTitle());
            videoOrder.setTotalFee(video.getPrice());
            videoOrder.setName(userName);
            return videoOrder;
        }
        return null;
    }

//    @Override
//    public VideoOrder getVideo(int videoId) {
////        String url = videoUrl + "?videoId=" + videoId;
//        //这里的serviceId就是nacos的服务器名称xdclass-order-service
//        //获取该服务  要调用的注册列表
//        //这里是discoverCliet
////        List<ServiceInstance> serviceInstances = discoveryClient.getInstances("xdclass-video-service");
////        for (ServiceInstance instance:instances){
////
////        }
////        ServiceInstance serviceInstance = serviceInstances.get(0);
////        String url = "http://" + serviceInstance.getHost()
////                + ":" + serviceInstance.getPort()
////                + "/api/v1/video/find_by_id?videoId=" + videoId;
//
////        String url = serviceInstance.getUri().toString()+"/api/v1/video/find_by_id?videoId=" + videoId;
//
//        //增加@LoadBalance之后，负载均衡方法
//        String url = "http://xdclass-video-service/api/v1/video/find_by_id?videoId=" + videoId;
//        Video video = restTemplate.getForObject(url, Video.class);
//        System.out.println(video);
//        if (video != null) {
//            VideoOrder videoOrder = new VideoOrder();
//            videoOrder.setVideoId(video.getId());
//            videoOrder.setVideoImg(video.getCoverImg());
//            videoOrder.setVideoTitle(video.getTitle());
//            videoOrder.setTotalFee(video.getPrice());
//            return videoOrder;
//        }
//        return null;
//    }

}
