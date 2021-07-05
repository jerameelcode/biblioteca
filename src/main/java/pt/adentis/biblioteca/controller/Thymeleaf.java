package pt.adentis.biblioteca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Thymeleaf {

    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("messages", "Hello, guys!");
        return "regras";
    }

}
