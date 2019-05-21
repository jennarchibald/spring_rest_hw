package com.example.filesystem.projections;

import com.example.filesystem.models.File;
import com.example.filesystem.models.Folder;

import java.util.List;

@Projection(name="embedFile", types= Folder.class)
public interface EmbedFile {

    String getTitle();
    List<File> getFiles();
}
