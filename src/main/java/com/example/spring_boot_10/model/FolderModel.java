package com.example.spring_boot_10.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "folders")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FolderModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "folder")
    private List<FileModel> files;
}