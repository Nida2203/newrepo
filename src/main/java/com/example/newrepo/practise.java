package com.example.newrepo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class practise {
    @GetMapping("/practise")
    public String getData() {return  "Please practise DEVOPS and DOCKER/KUBERNETES well" ; }
}