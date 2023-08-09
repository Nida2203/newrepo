package com.example.newrepo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class devops {
    @GetMapping("/devops")
    public String getData() {return  "Please practise DevOps daily - interesting and important !!! " ; }
}