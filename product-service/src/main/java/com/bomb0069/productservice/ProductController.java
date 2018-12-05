package com.bomb0069.productservice;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ProductController {

    @RequestMapping("/")
    public Product[] index() {
        Product[] products =  { new Product(1, "Lay Bar-B-Q") ,new Product(2, "Lay Onion") ,new Product(1, "Lay Classic") };
        return products;
    }

}