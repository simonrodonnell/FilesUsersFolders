package com.codeclan.example.OneToManyAndManyToOneRelationships.components;

import com.codeclan.example.OneToManyAndManyToOneRelationships.models.File;
import com.codeclan.example.OneToManyAndManyToOneRelationships.models.Folder;
import com.codeclan.example.OneToManyAndManyToOneRelationships.models.User;
import com.codeclan.example.OneToManyAndManyToOneRelationships.repositories.FileRepository;
import com.codeclan.example.OneToManyAndManyToOneRelationships.repositories.FolderRepository;
import com.codeclan.example.OneToManyAndManyToOneRelationships.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        User user1 = new User("Sideshow Bob");
        userRepository.save(user1);

        Folder folder1 = new Folder("Homework", user1);
        folderRepository.save(folder1);

        File file1 = new File("codeclan_week13_day_02_hw", ".md", 88, folder1);
        fileRepository.save(file1);
    }
}
