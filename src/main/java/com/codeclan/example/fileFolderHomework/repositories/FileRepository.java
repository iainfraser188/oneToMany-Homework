package com.codeclan.example.fileFolderHomework.repositories;

import com.codeclan.example.fileFolderHomework.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
