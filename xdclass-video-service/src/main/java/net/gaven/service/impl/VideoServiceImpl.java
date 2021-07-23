package net.gaven.service.impl;

import net.gaven.Video;
import net.gaven.dao.VideoMapper;
import net.gaven.service.IVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: lee
 * @create: 2021/7/23 8:49 上午
 **/
@Service
public class VideoServiceImpl implements IVideoService {
    @Autowired
    private VideoMapper videoMapper;

    @Override
    public Video findById(int videoId) {
        Video video = videoMapper.findById(videoId);
        return video;
    }
}
