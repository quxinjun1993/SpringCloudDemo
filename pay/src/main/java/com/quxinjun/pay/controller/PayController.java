package com.quxinjun.pay.controller;

import com.quxinjun.pay.service.PayService;
import com.quxinjun.pay.vo.UserPayVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/pay")
public class PayController {

    @Autowired
    private PayService payService;

    @GetMapping("/getUserPayInfo")
    public UserPayVo getUserPayInfo(@RequestParam("id") int id){
        System.err.println("当前请求的pay中的控制器");
        return payService.getUserPayInfo(id);
    }

    @GetMapping("/test")
    public String test(){
        return "this is payService test method";
    }
}
