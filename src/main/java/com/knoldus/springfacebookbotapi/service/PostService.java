package com.knoldus.springfacebookbotapi.service;

import com.knoldus.springfacebookbotapi.model.Post;
import com.knoldus.springfacebookbotapi.repository.ModelMapper;
import com.knoldus.springfacebookbotapi.repository.PostRepository;
import com.knoldus.springfacebookbotapi.repository.UserRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PostService {

    @Autowired
    PostRepository postRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    ModelMapper modelMapper;


    public List<Post> listAllUser() {
        return userRepository.findAll();
    }

    public void saveUser(Post post) {
        userRepository.save(post);
    }

    public User getUser(Integer id) {
        return (User) userRepository.findById(id).get();
    }


}
