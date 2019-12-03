package com.codeclan.example.OneToManyAndManyToOneRelationships.projections;


import com.codeclan.example.OneToManyAndManyToOneRelationships.models.File;
import com.codeclan.example.OneToManyAndManyToOneRelationships.models.Folder;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "EmbedFoldersForFiles", types = File.class)
public interface EmbedFoldersForFiles {
    String getName();
    String getExtension();
    int getSize();
    Folder getFolder();
}
