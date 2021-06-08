package com.smpexample.pos;

public class ChatData {
    private String msg;
    private String name;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ChatData(){}


    public ChatData(String name, String msg){

        this.name = name;
        this.msg = msg;
    }

}
