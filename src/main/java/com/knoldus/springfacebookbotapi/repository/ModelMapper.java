package com.knoldus.springfacebookbotapi.repository;

import com.knoldus.springfacebookbotapi.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelMapper extends JpaRepository<Post,Integer> {
}
