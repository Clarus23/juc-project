package com.juc.homepage.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter @NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UploadFile {
    @Id @GeneratedValue
    @Column(name = "file_id")
    private Long id;
    private String originalFilename;
    private String saveFilename;
    private String extension;
    private Long fileSize;
    private String savePath;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private Post post;
}
