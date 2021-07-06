package pt.adentis.biblioteca.service.impl;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import pt.adentis.biblioteca.entity.Category;
import pt.adentis.biblioteca.entity.User;
import pt.adentis.biblioteca.repository.CategoryRepository;
import pt.adentis.biblioteca.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl {

    @Autowired
    private UserRepository repository;

    public List<User> getUsers(){
        List<User> users = repository.findAll();
        return users;
    }

    public void deleteUser(User user){
        repository.delete(user);
    }

    @SneakyThrows
    public void disableUser(User user){
        User foundUser = repository.findById(user.getId()).orElseThrow(() -> new Exception());
        foundUser.setStatus(Boolean.FALSE);
        repository.save(foundUser);
    }
}
