package me.michalik.springdevelopment.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class MainController {

    @GetMapping
    public ResponseEntity getSample(){
        Map<String, Object> response = new HashMap<>();

        response.put("message", "Hello world sfasdf ");

        return ResponseEntity.ok(response);
    }

    @GetMapping("/test")
    public ResponseEntity getTest(){
        System.out.println("Hellasdf fasd ");
        return ResponseEntity.ok("test");
    }
}
