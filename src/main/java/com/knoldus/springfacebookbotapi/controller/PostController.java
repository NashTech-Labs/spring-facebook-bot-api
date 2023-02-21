package com.knoldus.springfacebookbotapi.controller;

import com.knoldus.springfacebookbotapi.model.Post;
import com.knoldus.springfacebookbotapi.service.PostService;
import java.util.List;
import java.util.NoSuchElementException;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/socialbot/createfeed")
public class PostController {

        @Autowired
        PostService postService;

        @GetMapping("/getfeed")
        public List<Post> list() {
            return postService.listAllUser();
        }

        @GetMapping("/{id}")
        public ResponseEntity<Post> get(@PathVariable Integer id) {
            try {
                Post post = (Post) postService.getUser(id);
                return new ResponseEntity<Post>((Post) post, HttpStatus.OK);
            } catch (NoSuchElementException e) {
                return new ResponseEntity<Post>(HttpStatus.NOT_FOUND);
            }
        }

        @PostMapping("/")
        public void add(@RequestBody Post post) {
            postService.saveUser(post);
        }

        @PutMapping("/{id}")
        public ResponseEntity<?> update(@RequestBody Post post, @PathVariable Integer id) {
            try {
                User existUser = postService.getUser(id);
                postService.saveUser(post);
                return new ResponseEntity<>(HttpStatus.OK);
            } catch (NoSuchElementException e) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }
    }
