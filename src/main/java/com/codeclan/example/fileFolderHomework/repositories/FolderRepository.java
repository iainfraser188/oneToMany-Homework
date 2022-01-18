package com.codeclan.example.fileFolderHomework.repositories;

import com.codeclan.example.fileFolderHomework.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder,Long> {
}
