package com.deploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String mainPage() {
        return "안녕하세요 반갑습니다";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello~~";
    }

    @GetMapping("/bye")
    public String bye() {
        return "bye";
    }
}
