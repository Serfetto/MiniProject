package com.example.spring_boot_10.controller;

import com.example.spring_boot_10.model.FileModel;
import com.example.spring_boot_10.model.FolderModel;
import com.example.spring_boot_10.repository.FileRepository;
import com.example.spring_boot_10.repository.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/file")
public class FileController {
    @Autowired
    private FileRepository fileRepository;

    @GetMapping("/add")
    public String blogAddFile( Model model)
    {
        return "blog_addfile";
    }

    @PostMapping("/add")
    public String addNewFile(@RequestBody FileModel fileRequest) {
        fileRepository.save(fileRequest);
        return "redirect:/file/all";
    }


    @GetMapping("/all")
    public String blogFiles(Model model) {
        Iterable<FileModel> files = fileRepository.findAll();
        model.addAttribute("files", files);
        return "blog_files";
    }
}
