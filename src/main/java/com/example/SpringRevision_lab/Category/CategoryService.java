package com.example.SpringRevision_lab.Category;

import com.example.SpringRevision_lab.Product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Category saveCategory (Category category){
        return categoryRepository.save(category);
    }

    public List <Category> getCategories(){
        return categoryRepository.findAll();
    }

}