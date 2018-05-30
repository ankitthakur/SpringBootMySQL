package com.springboot.mysql.restResource;

import com.springboot.mysql.model.User;
import com.springboot.mysql.repository.jpa.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/users")
public class UserResource {

    @Autowired
    UserRepository repository;

    @GetMapping(value = "/all")
    public List<User> getAll(){
        return repository.findAll();
    }

    @PostMapping(value = "/updateUser")
    public List<User> persist(@RequestBody final User user){
        repository.save(user);
        return repository.findAll();
    }

}
