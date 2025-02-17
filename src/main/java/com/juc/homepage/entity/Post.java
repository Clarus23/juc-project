package com.juc.homepage.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Post extends BaseTimeEntity {
    @Id @GeneratedValue
    @Column(name = "post_id")
    private Long id;
    private String title;
    private String content;

    //comment? notice?

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @OneToMany(mappedBy = "post")
    private List<UploadFile> files = new ArrayList<>();
}
