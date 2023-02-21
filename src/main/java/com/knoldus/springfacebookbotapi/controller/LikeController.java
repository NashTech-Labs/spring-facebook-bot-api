package com.knoldus.springfacebookbotapi.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.knoldus.springfacebookbotapi.service.LikeService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(value = "/like")
public class LikeController {

    private final LikeService likeService;

    @Autowired
    public LikeController(LikeService likeService, ObjectMapper objectMapper) {
        this.likeService = likeService;
    }

    @PostMapping(value = "/add")
    public int addLike(@RequestBody Map<String, Object> body) throws Exception {
        String postId = (String) body.get("postId");
        String loggedInUserId = (String) body.get("loggedInUserId");

        boolean result = this.likeService.addLike(postId, loggedInUserId);
        return likeService.getAllLikesForPost(postId);
    }
}
