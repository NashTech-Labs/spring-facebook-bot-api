package com.knoldus.springfacebookbotapi.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


    @AllArgsConstructor
    @NoArgsConstructor
    @Entity
    @Data
    public class VerificationTokens {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id;
        String token;

        //@OneToOne(fetch = FetchType.LAZY)
        @ManyToOne
        @JoinColumn(name = "post_id")
        Post post;

    }

