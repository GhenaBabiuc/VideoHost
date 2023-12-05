package com.example.video.service.impl;

import com.example.video.dao.VideoDao;
import com.example.video.model.Video;
import com.example.video.service.VideoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DefaultVideoService implements VideoService {

    @Resource
    private VideoDao videoDao;

    @Override
    public List<Video> getAllVideos() {
        return videoDao.getAllVideos();
    }
}
