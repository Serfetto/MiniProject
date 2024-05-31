package com.example.spring_boot_10.repository;

import com.example.spring_boot_10.model.FileModel;
import org.springframework.data.repository.CrudRepository;
public interface FileRepository extends CrudRepository<FileModel, Long> {
}
