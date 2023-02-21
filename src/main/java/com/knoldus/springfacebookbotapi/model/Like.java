package com.knoldus.springfacebookbotapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


    @Entity
    @Table(name = "likes")
    public class Like  {
        @Id
        @Column(name = "id", nullable = false)
        private Long id;

        private Long count = 0L;

       // private User user;
        @ManyToOne
        @JoinColumn(name = "post_id")
        private Post post;

        public double getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Like() {
        }

        @Column(name = "count")
        public Long getCount() {
            return this.count;
        }

        public void setCount(Long count) {
            this.count = count;
        }


//        @ManyToOne(targetEntity = Post.class)
//        @JoinColumn(name= "post_id", referencedColumnName = "id")
        public Post getPost() {
            return this.post;
        }

        public void setPost(Post post) {
            this.post = post;
        }


    }

