package com.codeclan.newsapp.NewsAppProject.projections;

import com.codeclan.newsapp.NewsAppProject.models.Article;
import com.codeclan.newsapp.NewsAppProject.models.Category;
import com.codeclan.newsapp.NewsAppProject.models.Journalist;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embededCategories", types = Article.class)
public interface EmbededCategories {
    public String getTitle();
    public int getRating();
    public String getSummary();
    public Journalist getJournalist();
    public List<Category> getCategories();
}
