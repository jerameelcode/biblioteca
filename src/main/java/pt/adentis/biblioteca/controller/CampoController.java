package pt.adentis.biblioteca.controller;

import pt.adentis.biblioteca.entity.Campo;
import pt.adentis.biblioteca.service.impl.CampoServiceImpl;
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
@RequestMapping("/campos")
public class CampoController {

    @Autowired
    private CampoServiceImpl service;

    @RequestMapping(path = "", method = RequestMethod.GET)
    public ResponseEntity<Page<Campo>> getPageable(@PageableDefault(size = 10, page = 0, direction = Sort.Direction.ASC) Pageable pageable){
        Page<Campo> campos = service.getCampos(pageable);
        campos.forEach(campo -> {
            campo.add(linkTo(CampoController.class).slash(campo.getId()).withSelfRel());
        });
        return ResponseEntity.ok(campos);
    }
}
