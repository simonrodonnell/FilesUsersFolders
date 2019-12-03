package com.codeclan.example.OneToManyAndManyToOneRelationships.repositories;

import com.codeclan.example.OneToManyAndManyToOneRelationships.models.Folder;
import com.codeclan.example.OneToManyAndManyToOneRelationships.projections.EmbedAllForFolders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedAllForFolders.class)
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
