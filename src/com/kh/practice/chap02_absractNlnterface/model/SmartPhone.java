package com.kh.practice.chap02_absractNlnterface.model;

public abstract class SmartPhone implements TouchDisplay,CellPhone {


    private String maker; //제조사 정보

    public SmartPhone() {
    }

    public String printInformation(){
        return null;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }
}
