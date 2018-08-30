package com.springboot.beans;

public class Welcome {
    public Welcome(String status) {
      //  super();
        this.status = status;
    }
    private final String status;
    public String getStatus() {
        return "ok";
    }
}