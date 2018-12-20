package com.bomb0069.storeservice;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class StoreController {

    @RequestMapping("/")
    public String index() {
        return "Store Service Available";
    }

}