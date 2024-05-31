package com.example.spring_boot_10.controller;

import com.example.spring_boot_10.model.FolderModel;
import com.example.spring_boot_10.repository.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/folder")
public class FolderController {

    @Autowired
    private FolderRepository folderRepository;

    @GetMapping("/add")
    public String blogAddFolder(Model model) {
        return "blog_addfolder";
    }

    @PostMapping("/add")
    public String addNewFolder(@RequestBody FolderModel folderRequest) {
        folderRepository.save(folderRequest);
        return "redirect:/folder/all";
    }

    @GetMapping("/all")
    public String blogFolder(Model model) {
        Iterable<FolderModel> folders = folderRepository.findAll();
        model.addAttribute("folders", folders);
        return "blog_folder";
    }
}
