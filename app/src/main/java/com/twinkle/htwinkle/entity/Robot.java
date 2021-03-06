package com.twinkle.htwinkle.entity;

public class Robot {

    public Robot() {
    }

    public Robot(String text) {
        this.text = text;
    }

    public Robot(int code, String text) {
        this.code = code;
        this.text = text;
    }

    /**
     * code : 200000
     * text : 亲，已帮你找到图片
     * url : http://m.image.so.com/i?q=%E7%BE%8E%E5%A5%B3
     */


    private int code;
    private String text;
    private String url;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


}
