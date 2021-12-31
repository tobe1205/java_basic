package com.kh.practice.chap02_absractNlnterface.model;

public class GalaxyNote9 extends SmartPhone implements NotePen {

    public GalaxyNote9() {
        String maker = "삼성";
    }

    @Override
    public String touch() {
        return "정전식, 와콤펜 지원";
    }

    public String printInformation(){
        return null;
    }

    @Override
    public boolean bluetoothPen() {
        return true;
    }

    @Override
    public String picture() {
        return "1200만 듀얼 카메라";
    }

    @Override
    public String charge() {
        return "고속 충전, 고속 무선 충전";
    }

    @Override
    public String makeCall() {
        return "번호를 누르고 통화버튼을 누름";
    }

    @Override
    public String takeCall() {
        return "수신 버튼을 누름";
    }

}
