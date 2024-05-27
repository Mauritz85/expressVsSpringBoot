package com.test.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import java.util.List;
import java.util.Arrays;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/messages")
    public ResponseEntity<List<String>> getMessages() {
        List<String> messages = Arrays.asList("Hello", "World", "Test", "Spring Boot");
        return ResponseEntity.ok(messages);
    }

    @PostMapping("/message")
    public ResponseEntity<String> postMessage(@RequestBody String message) {
        return ResponseEntity.ok("Received: " + message);
    }
}