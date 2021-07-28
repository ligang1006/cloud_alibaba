package net.gaven.service.fallback;

import net.gaven.Video;
import net.gaven.service.IOpenFeignOrderService;
import org.springframework.stereotype.Service;

/**
 * sentinel整合openFeign，实现兜底数据
 * <p>
 * 1、配置
 * feign.sentinel.enabled=true
 * <p>
 * 2、实现要替代的service,重写方法
 * 3、在接口添加@FeignClient(name = "xdclass-video-service",fallback = IOpenFeignOrderServiceFallback.class)
 *
 * @author: lee
 * @create: 2021/7/28 8:45 上午
 **/
@Service
public class IOpenFeignOrderServiceFallback implements IOpenFeignOrderService {
    @Override
    public Video findById(int videoId) {
        Video video = new Video();
        video.setCoverImg("默认");
        video.setId(1);
        return video;
    }
}
