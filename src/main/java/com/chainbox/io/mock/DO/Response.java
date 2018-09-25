package com.chainbox.io.mock.DO;

import org.springframework.http.HttpStatus;

public class Response {

    private int code;
    private HttpStatus reason;

    public Response() {
    }

    public Response(int code, HttpStatus reason) {
        this.code = code;
        this.reason = reason;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public HttpStatus getReason() {
        return reason;
    }

    public void setReason(HttpStatus reason) {
        this.reason = reason;
    }
}
