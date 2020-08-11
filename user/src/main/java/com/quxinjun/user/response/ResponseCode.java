package com.quxinjun.user.response;

import lombok.Data;

public enum ResponseCode {
    SUCCESS(10000,"SUCCESS"),
    ERROR(10001,"ERROR"),
    NEED_LOGIN(0,"NEED_LOGIN"),
    ILLEGAL_ARGUMENT(10002,"ILLEGAL_ARGUMENT");

    private final int code;
    private final String desc;

    ResponseCode(int code,String desc){
        this.code = code;
        this.desc = desc;
    }

    public int getCode(){
        return code;
    }
    public String getDesc(){
        return desc;
    }

}
