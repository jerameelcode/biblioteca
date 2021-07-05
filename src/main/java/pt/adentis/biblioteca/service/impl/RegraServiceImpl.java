package pt.adentis.biblioteca.service.impl;

import pt.adentis.biblioteca.entity.Regra;
import pt.adentis.biblioteca.repository.RegraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class RegraServiceImpl {

    @Autowired
    private RegraRepository repository;

    public Page<Regra> getRegras(Pageable pageable){
        Page<Regra> regras = repository.findAll(pageable);
        return regras;
    }
}
