package com.codeclan.example.fileFolderHomework.models;

import javax.persistence.*;

@Entity
@Table(name="files")
public class File {

    @Column(name= "name")
    private String name;

    @Column(name="extension")
    private String extension;

    @Column (name="size_mb")
    private int size_mb;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @ManyToOne
    @JoinColumn(name = "folder_id",nullable = false)
    private Folder folder;

    public File(){

    }

    public File(String name, String extension, int size_mb,Folder folder) {
        this.name = name;
        this.extension = extension;
        this.size_mb = size_mb;
        this.folder = folder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public int getSize() {
        return size_mb;
    }

    public void setSize(int size_mb) {
        this.size_mb = size_mb;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }
}
