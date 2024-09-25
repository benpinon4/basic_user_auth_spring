package com.example.user_authentication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class SecurityDemoController {
    @GetMapping("/public")
    public String publicEndPoint(){
        return "This is a public endpoint";
    }
    @GetMapping("/admin")
    public String adminEndPoint(){
        return "This is a admind endpoint";
    }
    @GetMapping("/user")
    public String userEndPoint(){
        return "This is a user endpoint";
    }
}
