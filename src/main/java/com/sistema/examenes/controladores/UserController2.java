package com.sistema.examenes.controladores;

import com.sistema.examenes.entidades.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController2 {
    
    @CrossOrigin(origins={"http://localhost:4200", "https://frontendnov.web.app"})
    @PostMapping("/user/")    
    public User validate(@RequestBody User element) throws Exception {
        
        User newuser = new User();
        
        newuser.setPwd(element.getPwd());
        newuser.setToken(element.getToken());
        newuser.setUser(element.getUser());
        
        System.out.println(element.getUser());
        return newuser;    
    
    
}
}