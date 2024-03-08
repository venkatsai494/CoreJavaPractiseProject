package com.enums;

public enum HttpStatusCodeEnum {
    OK(200),
    BAD_REQUEST(400),
    NOT_FOUND(404),
    INTERNAL_SERVER_ERROR(500);

    private final int code;

    HttpStatusCodeEnum(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}

class Demo2{
    public static void main(String[] args) {
        HttpStatusCodeEnum code = HttpStatusCodeEnum.OK;
        int iCode = code.getCode();
        System.out.println(iCode);

    }


}
