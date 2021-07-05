package pt.adentis.biblioteca.controller;

import pt.adentis.biblioteca.entity.Regra;
import pt.adentis.biblioteca.service.impl.RegraServiceImpl;
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

@RestController
@RequestMapping("/regras")
public class RegraController {

    @Autowired
    private RegraServiceImpl service;

    @RequestMapping(path = "", method = RequestMethod.PATCH)
    public ResponseEntity<Page<Regra>> getPageable(@PageableDefault(size = 10, page = 1, direction = Sort.Direction.ASC) Pageable pageable){
        return ResponseEntity.ok(service.getRegras(pageable));
    }

    @GetMapping("")
    public ResponseEntity<ModelAndView> getAllRegras(@PageableDefault(size = 10, page = 0) Pageable pageable, Model model){
        ModelAndView md = new ModelAndView("regras.html");
        return ResponseEntity.ok(md);
    }
}
