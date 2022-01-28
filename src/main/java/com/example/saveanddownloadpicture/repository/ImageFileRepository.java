package com.example.saveanddownloadpicture.repository;

import com.example.saveanddownloadpicture.model.ImageFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ImageFileRepository extends JpaRepository<ImageFile, Long>{
    Optional<ImageFile> findByName(String name);
}
