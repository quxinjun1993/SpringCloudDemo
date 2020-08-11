package com.quxinjun.pay.service;

import com.quxinjun.pay.vo.UserPayVo;
import org.springframework.stereotype.Repository;

@Repository
public interface PayService {

    UserPayVo getUserPayInfo(int id);

}
