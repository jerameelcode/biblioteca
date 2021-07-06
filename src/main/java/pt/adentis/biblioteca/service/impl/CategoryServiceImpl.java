package pt.adentis.biblioteca.service.impl;

import pt.adentis.biblioteca.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import pt.adentis.biblioteca.repository.CategoryRepository;

@Service
public class CategoryServiceImpl {

    @Autowired
    private CategoryRepository repository;

    public Page<Category> getCategories(Pageable pageable){
        Page<Category> categories = repository.findAll(pageable);
        return categories;
    }
}
