package com.quxinjun.user.controller;

import com.quxinjun.user.api.PayClientApi;
import com.quxinjun.user.response.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/user")
public class UserPayController {

    @Autowired
    private PayClientApi payClientApi;

    @GetMapping(value = "/getUserPayInfo/{id}")
    public ServerResponse getUserPayInfo(@PathVariable int id){
        System.err.println("当前请求的user中的控制器。。。");
        return ServerResponse.createBySuccess(payClientApi.getUserPayInfo(id));
    }

    @GetMapping("/test")
    public String test(){
        return "this is userService test method";
    }
}
