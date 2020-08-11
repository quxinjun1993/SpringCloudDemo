package com.quxinjun.user.hystrix;

import com.quxinjun.user.api.PayClientApi;
import com.quxinjun.user.vo.UserPayVo;
import org.springframework.stereotype.Component;

@Component
public class UserPayClientApiFallback implements PayClientApi {

    @Override
    public UserPayVo getUserPayInfo(int id) {
        System.err.println("UserPayHystrix...........................");
        UserPayVo userPayVo = new UserPayVo();
        userPayVo.setId(0);
        userPayVo.setName("quxinjun" + 0);
        userPayVo.setBalance(0);
        return userPayVo;
    }
}
