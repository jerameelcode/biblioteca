package pt.adentis.biblioteca.controller;

import org.springframework.stereotype.Controller;
import pt.adentis.biblioteca.entity.Book;
import pt.adentis.biblioteca.service.impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookServiceImpl service;

    @RequestMapping(path = "/book", method = RequestMethod.GET)
    public String getPageable(Model model){
        List<Book> books = service.getBooks();
        model.addAttribute("books", books);
        model.addAttribute("title", "Tela de Livros");
        return "book";
    }

}
