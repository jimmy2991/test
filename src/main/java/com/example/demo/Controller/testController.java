package com.example.demo.Controller;

import com.example.demo.Service.testService;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;
@RestController
public class testController {
    private final testService test;

    @Autowired
    public testController(testService test) {
        this.test = test;
    }

    @GetMapping("/users")
    public List<User> getAllUser() {
        return test.getUser();
    }

}
