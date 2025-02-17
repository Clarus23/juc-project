package com.juc.homepage.repository;

import com.juc.homepage.entity.UploadFile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<UploadFile,Long> {
}
