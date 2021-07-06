package pt.adentis.biblioteca.controller;

import pt.adentis.biblioteca.entity.Category;
import pt.adentis.biblioteca.service.impl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryServiceImpl service;

    @RequestMapping(path = "", method = RequestMethod.GET)
    public ResponseEntity<Page<Category>> getPageable(@PageableDefault(size = 10, page = 0, direction = Sort.Direction.ASC) Pageable pageable){
        Page<Category> categories = service.getCategories(pageable);
        categories.forEach(category -> {
            category.add(linkTo(CategoryController.class).slash(category.getId()).withSelfRel());
        });
        return ResponseEntity.ok(categories);
    }
}
