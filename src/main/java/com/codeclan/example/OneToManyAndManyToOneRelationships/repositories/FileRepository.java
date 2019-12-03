package com.codeclan.example.OneToManyAndManyToOneRelationships.repositories;

import com.codeclan.example.OneToManyAndManyToOneRelationships.models.File;
import com.codeclan.example.OneToManyAndManyToOneRelationships.projections.EmbedFoldersForFiles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFoldersForFiles.class)
public interface FileRepository extends JpaRepository<File, Long> {
}
