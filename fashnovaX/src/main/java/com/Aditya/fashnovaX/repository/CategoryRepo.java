package com.Aditya.fashnovaX.repository;

import com.Aditya.fashnovaX.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepo extends JpaRepository<Category,Long> {


    List<Category> findByIsActiveTrue();


    List<Category> findByParentIsNull();


    List<Category> findByParentId(Long parentId);


    boolean existsByName(String name);


}
