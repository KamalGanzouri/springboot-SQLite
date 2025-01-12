package com.ganzouri.springbootwsqlite;

import com.ganzouri.springbootwsqlite.entity.User;
import com.ganzouri.springbootwsqlite.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLOutput;

@Controller
@RequestMapping
public class TestController {
    UserRepo userRepo;

    @Autowired
    public TestController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }
    @GetMapping
    public String index() {
        userRepo.save(new User("Ganzouri"));
        System.out.println("User saved");
        return "index";
    }
}
