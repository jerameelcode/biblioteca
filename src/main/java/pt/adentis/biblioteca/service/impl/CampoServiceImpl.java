package pt.adentis.biblioteca.service.impl;

import pt.adentis.biblioteca.entity.Campo;
import pt.adentis.biblioteca.repository.CampoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CampoServiceImpl {

    @Autowired
    private CampoRepository repository;

    public Page<Campo> getCampos(Pageable pageable){
        Page<Campo> campos = repository.findAll(pageable);
        return campos;
    }
}
