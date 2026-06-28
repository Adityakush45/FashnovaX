package com.Aditya.fashnovaX.service;


import com.Aditya.fashnovaX.entity.Category;

import java.util.List;

public interface CategoryService {

    List<Category> findAllRootCategories();

    List<Category> findChildren(Long parentId);

    Category findCategoryById(Long id);
}