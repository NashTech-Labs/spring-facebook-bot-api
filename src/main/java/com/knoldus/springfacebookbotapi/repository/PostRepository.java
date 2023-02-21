package com.knoldus.springfacebookbotapi.repository;

import com.knoldus.springfacebookbotapi.model.Post;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post,String> {

//    List<Post> findPostByUserOrderById(Post post);
//
//    List<Post> findAllByOrderByIdDesc();
}

