package com.codeclan.example.OneToManyAndManyToOneRelationships.projections;

import com.codeclan.example.OneToManyAndManyToOneRelationships.models.Folder;
import com.codeclan.example.OneToManyAndManyToOneRelationships.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "EmbedFoldersForUsersClass", types = User.class)
public interface EmbedFoldersForUsers {
    String getName();
    List<Folder> getListOfFolders();
}
