package com.codeclan.example.OneToManyAndManyToOneRelationships.controllers;

import com.codeclan.example.OneToManyAndManyToOneRelationships.repositories.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/folders")
public class FolderController {
    @Autowired
    FolderRepository folderRepository;
}
