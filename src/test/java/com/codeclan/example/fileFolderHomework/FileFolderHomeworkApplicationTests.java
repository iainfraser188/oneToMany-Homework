package com.codeclan.example.fileFolderHomework;

import com.codeclan.example.fileFolderHomework.models.Folder;
import com.codeclan.example.fileFolderHomework.models.User;
import com.codeclan.example.fileFolderHomework.repositories.FolderRepository;
import com.codeclan.example.fileFolderHomework.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FileFolderHomeworkApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	FolderRepository folderRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createFolderAndUserThenSave(){

		User iain = new User("iain");
		userRepository.save(iain);
		Folder games = new Folder("games",iain);
		folderRepository.save(games);

	}

}
