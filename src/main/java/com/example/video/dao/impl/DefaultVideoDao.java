package com.example.video.dao.impl;

import com.example.video.dao.VideoDao;
import com.example.video.model.Video;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class DefaultVideoDao implements VideoDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Video> getAllVideos() {
        return entityManager.createQuery("SELECT v FROM Video v", Video.class).getResultList();
    }
}
