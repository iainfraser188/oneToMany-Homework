package com.codeclan.example.fileFolderHomework.controllers;

import com.codeclan.example.fileFolderHomework.models.User;
import com.codeclan.example.fileFolderHomework.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "/users")
    public ResponseEntity<List<User>> getAllUsers(){
        return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/users/{id}")
    public ResponseEntity<Optional<User>>getUser(@PathVariable Long id){
        Optional<User> payload = userRepository.findById(id);
        if(payload.isPresent()){
            return new ResponseEntity<>(payload,HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(payload,HttpStatus.NOT_FOUND);
        }
    }
}
