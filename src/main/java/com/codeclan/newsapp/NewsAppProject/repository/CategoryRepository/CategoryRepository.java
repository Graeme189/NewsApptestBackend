package com.codeclan.newsapp.NewsAppProject.repository.CategoryRepository;

import com.codeclan.newsapp.NewsAppProject.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
@RepositoryRestResource

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
