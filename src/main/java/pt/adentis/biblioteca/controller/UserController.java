package pt.adentis.biblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import pt.adentis.biblioteca.entity.Book;
import pt.adentis.biblioteca.entity.User;
import pt.adentis.biblioteca.service.impl.BookServiceImpl;
import pt.adentis.biblioteca.service.impl.UserServiceImpl;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl service;

    @RequestMapping(path = "", method = RequestMethod.GET)
    public String getPageable(Model model){
        List<User> users = service.getUsers();
        model.addAttribute("users", users);
        model.addAttribute("title", "Tela de Utilizadores");
        return "user";
    }

    @RequestMapping(path="/disable", method = RequestMethod.POST)
    public void disableUser(User user){
        System.out.println(user.getName());
//        User user = new User();
//        user.setId(userId);
        service.disableUser(user);
    }

}
