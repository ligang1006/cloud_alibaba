package net.gaven.service;

import net.gaven.Video;

/**
 * @author: lee
 * @create: 2021/7/23 8:55 上午
 **/
public interface IVideoService {
    /**
     * 通过Id查询
     * @param videoId
     * @return
     */
    Video findById(int videoId);
}
