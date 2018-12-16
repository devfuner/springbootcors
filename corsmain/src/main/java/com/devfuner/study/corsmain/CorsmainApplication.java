package com.devfuner.study.corsmain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CorsmainApplication {

    // 개별적으로 허용할때는 아래의 어노테이션을 사용하면 됨.
//    @CrossOrigin(origins = "http://localhost:18080")
    @GetMapping("hello")
    public String hello() {
        return "hello";
    }

    public static void main(String[] args) {
        SpringApplication.run(CorsmainApplication.class, args);
    }

}

