package com.codeclan.example.fileFolderHomework.repositories;

import com.codeclan.example.fileFolderHomework.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
