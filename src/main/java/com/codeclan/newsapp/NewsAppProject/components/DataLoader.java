package com.codeclan.newsapp.NewsAppProject.components;

import com.codeclan.newsapp.NewsAppProject.models.Article;
import com.codeclan.newsapp.NewsAppProject.models.Category;
import com.codeclan.newsapp.NewsAppProject.models.Journalist;
import com.codeclan.newsapp.NewsAppProject.repository.ArticleRepository.ArticleRepository;
import com.codeclan.newsapp.NewsAppProject.repository.CategoryRepository.CategoryRepository;
import com.codeclan.newsapp.NewsAppProject.repository.JournalistRepository.JournalistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    ArticleRepository articleRepository;

    @Autowired
    JournalistRepository journalistRepository;

    @Autowired
    CategoryRepository categoryRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        Journalist journalist1 = new Journalist( "Billy", "John");
        journalistRepository.save(journalist1);

        Category category1 = new Category("Politics");
        categoryRepository.save(category1);

        Category category2 = new Category("Sport");
        categoryRepository.save(category2);

        Article article1 = new Article("Great news", 3, "More great news", "really great news",  journalist1, "www" +
                ".greatpic.com");

        articleRepository.save(article1);

        article1.addCategory(category1);
        articleRepository.save(article1);
    }
}

