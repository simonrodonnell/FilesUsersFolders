package com.codeclan.example.OneToManyAndManyToOneRelationships.controllers;

import com.codeclan.example.OneToManyAndManyToOneRelationships.repositories.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/files")
public class FileController {
    @Autowired
    FileRepository fileRepository;

}
