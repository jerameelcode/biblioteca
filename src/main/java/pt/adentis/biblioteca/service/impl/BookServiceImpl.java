package pt.adentis.biblioteca.service.impl;

import pt.adentis.biblioteca.entity.Book;
import pt.adentis.biblioteca.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl {

    @Autowired
    private BookRepository repository;

    public List<Book> getBooks(){
        List<Book> regras = repository.findAll();
        return regras;
    }
}
