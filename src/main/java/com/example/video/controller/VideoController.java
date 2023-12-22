package com.example.video.controller;

import com.example.video.model.movie.Video;
import com.example.video.service.VideoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/videos")
public class VideoController {
    @Resource
    private VideoService videoService;

    @GetMapping("/getAllVideo")
    public @ResponseBody List<Video> getAllVideos() {
        return videoService.getAllVideos();
    }
}
