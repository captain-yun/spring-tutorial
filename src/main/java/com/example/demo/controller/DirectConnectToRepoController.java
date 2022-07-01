package com.example.demo.controller;

import com.example.demo.obj.Result;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// RestController는 path방식
@RestController
@RequestMapping("/") // main사이트
public class DirectConnectToRepoController {
    @Autowired
    UserRepository userRepository;

    @GetMapping(path="/demo")
    public @ResponseBody Result getUsers(){
        Result result = new Result();
        result.data = userRepository.findAll();
        return result; // RestController가 JSON화 시켜서 return 해줌
    }
}
