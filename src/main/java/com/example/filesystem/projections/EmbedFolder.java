package com.example.filesystem.projections;

import com.example.filesystem.emuns.FileExtension;
import com.example.filesystem.models.File;
import com.example.filesystem.models.Folder;
import com.example.filesystem.models.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedFolder", types = File.class)
public interface EmbedFolder {

    String getName();
    FileExtension getExtension();
    int getSize();
    Folder getFolder();
}
