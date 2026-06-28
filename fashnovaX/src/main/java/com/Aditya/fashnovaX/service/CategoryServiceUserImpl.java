package com.Aditya.fashnovaX.service;

import com.Aditya.fashnovaX.entity.Category;
import com.Aditya.fashnovaX.exception.ResourceNotFoundException;
import com.Aditya.fashnovaX.repository.CategoryRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceUserImpl implements CategoryService {

    private final CategoryRepo categoryRepo;

    @Override
    public List<Category> findAllRootCategories(){

        List<Category> cat = categoryRepo.findByParentIsNull();

        return cat;

    }

    @Override
    public List<Category> findChildren(Long parentId){

        List<Category> categories = categoryRepo.findByParentId(parentId);

        return categories;

    }

    @Override
    public Category findCategoryById(Long id){

        Category category = categoryRepo.findById(id).orElseThrow( () -> new ResourceNotFoundException("Category" , id));

        return category;

    }


}
