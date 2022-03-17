package dev.cfan.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {


    @GetMapping("/")
    public String sayHello(){
        return "Hello!";
    }

}
