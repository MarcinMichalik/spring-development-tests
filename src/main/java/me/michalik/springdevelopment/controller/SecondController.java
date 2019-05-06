package me.michalik.springdevelopment.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v2")
public class SecondController {

    @GetMapping
    public ResponseEntity getSample(){
        Map<String, Object> response = new HashMap<>();

        response.put("message", "Hello world v2 - xxx ");

        return ResponseEntity.ok(response);
    }

}
