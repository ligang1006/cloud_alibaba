package net.gaven.dao;

import net.gaven.Video;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author: lee
 * @create: 2021/7/23 8:55 上午
 **/
@Repository
public interface VideoMapper {
    @Select("select * from video where id=#{videoId}")
    Video findById(@Param("videoId") int videoId);
}
