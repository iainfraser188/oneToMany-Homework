package com.codeclan.example.fileFolderHomework.controllers;

import com.codeclan.example.fileFolderHomework.models.File;
import com.codeclan.example.fileFolderHomework.models.Folder;
import com.codeclan.example.fileFolderHomework.repositories.FileRepository;
import com.codeclan.example.fileFolderHomework.repositories.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class FileController {

    @Autowired
    FileRepository fileRepository;

    @GetMapping(value = "/files")
    public ResponseEntity<List<File>> getAllFiles(){
        return new ResponseEntity<>(fileRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/files/{id}")
    public ResponseEntity<Optional<File>>getFolder(@PathVariable Long id){
        Optional<File> payload = fileRepository.findById(id);
        if(payload.isPresent()){
            return new ResponseEntity<>(payload,HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(payload,HttpStatus.NOT_FOUND);
        }
    }
}
