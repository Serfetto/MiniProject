package com.example.spring_boot_10.repository;

import com.example.spring_boot_10.model.FolderModel;
import org.springframework.data.repository.CrudRepository;
public interface FolderRepository extends CrudRepository<FolderModel, Long> {
}
