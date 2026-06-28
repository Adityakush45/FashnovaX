package com.Aditya.fashnovaX.contoller;

import com.Aditya.fashnovaX.entity.Category;
import com.Aditya.fashnovaX.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;


    @GetMapping
    public ResponseEntity<List<Category>> getAllRootCategories() {
        return ResponseEntity.ok(categoryService.findAllRootCategories());
    }


    @GetMapping("/ {id}/subCategories")
    public ResponseEntity<List<Category>> getChildren(@PathVariable Long id) {
        return ResponseEntity.ok(categoryService.findChildren(id));
    }


    @GetMapping("/{id}")
    public ResponseEntity<Category> getCategoryById(@PathVariable Long id) {
        return ResponseEntity.ok(categoryService.findCategoryById(id));
    }
}
