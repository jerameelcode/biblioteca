package pt.adentis.biblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import pt.adentis.biblioteca.entity.Book;
import pt.adentis.biblioteca.entity.User;
import pt.adentis.biblioteca.service.impl.BookServiceImpl;
import pt.adentis.biblioteca.service.impl.UserServiceImpl;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserServiceImpl service;

    @RequestMapping(path = "", method = RequestMethod.GET)
    public ResponseEntity<Page<User>> getPageable(@PageableDefault(size = 10, page = 0, direction = Sort.Direction.ASC) Pageable pageable){
        return ResponseEntity.ok(service.getUsers(pageable));
    }

}
