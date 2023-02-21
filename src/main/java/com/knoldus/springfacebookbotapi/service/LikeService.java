package com.knoldus.springfacebookbotapi.service;

import com.knoldus.springfacebookbotapi.repository.PostRepository;
import com.knoldus.springfacebookbotapi.repository.UserRepository;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class LikeService {

    public LikeService(PostRepository postRepository, UserRepository userRepository) {
        //  private final LikeRepository likeRepository;
    }

    public int getAllLikesForPost(String postId) {
        return 0;
    }

    public boolean addLike(String postId, String loggedInUserId) {
        return false;
    }

}