package com.codeclan.example.fileFolderHomework.controllers;

import com.codeclan.example.fileFolderHomework.models.Folder;
import com.codeclan.example.fileFolderHomework.repositories.FolderRepository;
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
public class FolderController {

    @Autowired
    FolderRepository folderRepository;

    @GetMapping(value = "/folders")
    public ResponseEntity<List<Folder>>getAllFolders(){
        return new ResponseEntity<>(folderRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/folders/{id}")
    public ResponseEntity<Optional<Folder>>getFolder(@PathVariable Long id){
        Optional<Folder> payload = folderRepository.findById(id);
        if(payload.isPresent()){
            return new ResponseEntity<>(payload,HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(payload,HttpStatus.NOT_FOUND);
        }
    }
}
