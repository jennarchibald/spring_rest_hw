package com.example.filesystem.projections;

import com.example.filesystem.models.File;
import com.example.filesystem.models.Folder;
import com.example.filesystem.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedUser", types = Folder.class)
public interface EmbedUser {

    String getTitle();

    List<File> getFiles();

    User getUser();

}
