package com.kh.practice.chap02_absractNlnterface.model;

public abstract class SmartPhone implements TouchDisplay,CellPhone {


    private String maker; //제조사 정보

    public SmartPhone() {
    }

    public abstract String printInformation();

    public String getMaker() {
        return this.maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }
}
