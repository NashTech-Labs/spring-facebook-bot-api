package com.knoldus.springfacebookbotapi.model;


import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
    @Table(name = "posts")
    public class Post {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

//        @ManyToOne(fetch = FetchType.EAGER)
//        @JoinColumn(name = "pos_id",referencedColumnName = "id")

//        @ManyToOne
//        @JoinColumn(name = "post_id")


        //@Column(columnDefinition="TEXT")
        private String message;

       // @Column(name="createdDate", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
        @Temporal(TemporalType.TIMESTAMP)
        private Date createdDate;

        @PrePersist
        public void prePersist() {
            createdDate = new Date();
        }
        public Post() {
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }


        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public Date getCreatedDate() {
            return createdDate;
        }

        public void setCreatedDate(Date createdDate) {
            this.createdDate = createdDate;
        }
    }

