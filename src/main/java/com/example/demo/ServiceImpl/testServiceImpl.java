package com.example.demo.ServiceImpl;

import com.example.demo.Repository.UserRepository;
import com.example.demo.Service.testService;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class testServiceImpl implements testService {
    public final UserRepository testS;

    public testServiceImpl(@Autowired UserRepository testS) {
        this.testS = testS;
    }

    @Override
    public List<User> getUser() {
        return testS.findAll();
    }

}
