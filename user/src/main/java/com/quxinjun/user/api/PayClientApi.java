package com.quxinjun.user.api;

import com.quxinjun.user.hystrix.UserPayClientApiFallback;
import com.quxinjun.user.vo.UserPayVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "payService",fallback = UserPayClientApiFallback.class)
public interface PayClientApi {

    @GetMapping("/pay/getUserPayInfo")
    UserPayVo getUserPayInfo(@RequestParam(name = "id") int id);
}
