package com.codeclan.newsapp.NewsAppProject.controller;

import com.codeclan.newsapp.NewsAppProject.repository.JournalistRepository.JournalistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/journalists")
public class JournalistController {
    @Autowired
    JournalistRepository journalistRepository;
}

