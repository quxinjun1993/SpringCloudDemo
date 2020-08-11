package com.quxinjun.pay.service.impl;

import com.quxinjun.pay.service.PayService;
import com.quxinjun.pay.vo.UserPayVo;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PayServiceImpl implements PayService {

    public static Map<Integer,UserPayVo> map = new HashMap<>();

    static{
        for(int i = 1; i <= 10; i++){
            UserPayVo userPayVo = new UserPayVo();
            userPayVo.setId(i);
            userPayVo.setName("quxinjun" + i);
            userPayVo.setBalance(i * 100);
            map.put(i,userPayVo);
        }
    }

    @Override
    public UserPayVo getUserPayInfo(int id) {
        return this.getUserPayInfoById(id);
    }

    private UserPayVo getUserPayInfoById(int id){
        return map.get(id);
    }

}
