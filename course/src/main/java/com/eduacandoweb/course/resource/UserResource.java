package com.eduacandoweb.course.resource;

//CONTROLADORES REST, recurso web implementado por um rest

import com.eduacandoweb.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (value = "/users")
public class UserResource {

    @GetMapping("/")
    public ResponseEntity <User> findAll() {
        User u = new User(1L, "Maria", "maria@gmail.com", "9999-9999", "1234");
        return ResponseEntity.ok().body(u);
    }
}
