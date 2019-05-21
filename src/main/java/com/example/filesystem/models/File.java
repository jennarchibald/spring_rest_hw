package com.example.filesystem.models;

import com.example.filesystem.emuns.FileExtension;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name="files")
public class File {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="extension")
    private FileExtension extension;

    @Column(name="size")
    private int size;

    @JsonIgnoreProperties("files")
    @ManyToOne
    @JoinColumn(name="folder_id", nullable = false)
    private Folder folder;

    public File(String name, FileExtension extension, int size, Folder folder) {
        this.name = name;
        this.extension = extension;
        this.size = size;
        this.folder = folder;
    }

    public File() {
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

    public FileExtension getExtension() {
        return extension;
    }

    public void setExtension(FileExtension extension) {
        this.extension = extension;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }
}
