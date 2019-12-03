package com.codeclan.example.OneToManyAndManyToOneRelationships.projections;

import com.codeclan.example.OneToManyAndManyToOneRelationships.models.File;
import com.codeclan.example.OneToManyAndManyToOneRelationships.models.Folder;
import com.codeclan.example.OneToManyAndManyToOneRelationships.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "EmbedAllForFolders", types = Folder.class)
public interface EmbedAllForFolders {
    String getName();
    User getUser();
    List<File> getListOfFiles();
}
