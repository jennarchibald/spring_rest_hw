package com.example.filesystem.repositories;

import com.example.filesystem.models.Folder;
import com.example.filesystem.projections.EmbedFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptsProjection = EmbedFile.class)
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
