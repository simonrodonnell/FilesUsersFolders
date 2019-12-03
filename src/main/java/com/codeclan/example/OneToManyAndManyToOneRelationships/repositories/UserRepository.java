package com.codeclan.example.OneToManyAndManyToOneRelationships.repositories;

import com.codeclan.example.OneToManyAndManyToOneRelationships.models.User;
import com.codeclan.example.OneToManyAndManyToOneRelationships.projections.EmbedFoldersForUsers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFoldersForUsers.class)
public interface UserRepository extends JpaRepository<User, Long> {
}
