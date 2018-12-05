package com.bomb0069.productservice;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ProductController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}