package com.juc.homepage.entity;

import jakarta.persistence.*;

@Entity
public class Comment extends BaseTimeEntity{
    @Id @GeneratedValue
    @Column(name = "comment_id")
    private Long id;
    private String createUser;
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private Post post;

    // comment 작성자를 N:1로 넣을까? 아니면 그냥 String 형으로 넣을까?
}
