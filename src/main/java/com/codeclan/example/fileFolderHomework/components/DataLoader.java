package com.codeclan.example.fileFolderHomework.components;

import com.codeclan.example.fileFolderHomework.models.File;
import com.codeclan.example.fileFolderHomework.models.Folder;
import com.codeclan.example.fileFolderHomework.models.User;
import com.codeclan.example.fileFolderHomework.repositories.FileRepository;
import com.codeclan.example.fileFolderHomework.repositories.FolderRepository;
import com.codeclan.example.fileFolderHomework.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args) {
        User iain = new User("iain");
        userRepository.save(iain);

        Folder games = new Folder("games",iain);
        folderRepository.save(games);

        Folder music = new Folder("music",iain);
        folderRepository.save(music);

        File redAlert2 = new File("redAlert2",".exe",7000,games);
        fileRepository.save(redAlert2);

        File song = new File("song2",".wav",3,music);
        fileRepository.save(song);

    }
}

