package com.codeclan.example.OneToManyAndManyToOneRelationships.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "folders")
public class Folder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @JsonIgnoreProperties(value = "folder")
    @OneToMany(mappedBy = "folder")
    private List<File> listOfFiles;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Folder(String name, User user) {
        this.name = name;
        this.user = user;
        this.listOfFiles = new ArrayList<>();
    }

    public Folder() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<File> getListOfFiles() {
        return listOfFiles;
    }

    public void setListOfFiles(List<File> listOfFiles) {
        this.listOfFiles = listOfFiles;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
