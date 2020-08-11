package com.quxinjun.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/order")
public class OrderController {

    @GetMapping("/test")
    public String test(){
        return "this is orderService test method";
    }
}
