package com.codeclan.example.OneToManyAndManyToOneRelationships;

import com.codeclan.example.OneToManyAndManyToOneRelationships.models.File;
import com.codeclan.example.OneToManyAndManyToOneRelationships.models.Folder;
import com.codeclan.example.OneToManyAndManyToOneRelationships.models.User;
import com.codeclan.example.OneToManyAndManyToOneRelationships.repositories.FileRepository;
import com.codeclan.example.OneToManyAndManyToOneRelationships.repositories.FolderRepository;
import com.codeclan.example.OneToManyAndManyToOneRelationships.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OneToManyAndManyToOneRelationshipsApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	UserRepository userRepository;

	@Autowired
	FolderRepository folderRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateFilesFoldersUsers() {
		User user1 = new User("Bob");
		userRepository.save(user1);

		Folder folder1 = new Folder("Homework", user1);
		folderRepository.save(folder1);

		File file1 = new File("codeclan_week13_day_02_hw", ".md", 88, folder1);
		fileRepository.save(file1);
	}
}
