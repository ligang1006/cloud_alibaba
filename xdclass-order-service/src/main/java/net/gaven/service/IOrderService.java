package net.gaven.service;

import net.gaven.Video;
import net.gaven.VideoOrder;

/**
 * @author: lee
 * @create: 2021/7/23 10:59 上午
 **/
public interface IOrderService {
    /**
     * 通过id获取视频
     *
     * @param videoId
     * @return
     */
    VideoOrder getVideo(int videoId);
}
