package com.juc.homepage.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Attendance {
    @Id @GeneratedValue
    @Column(name = "attendace_id")
    private Long id;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd HH:mm")
    private LocalDateTime attendaceTime;
    private boolean check;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;
}
