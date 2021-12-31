package com.kh.practice.chap02_absractNlnterface.model;

public class V40 extends SmartPhone implements NotePen{

    public V40() {
    }

    @Override
    public String picture() {
        return "1200, 1600만 트리플 카메라";
    }

    @Override
    public String charge() {
        return "고속 충전, 고속 무선 충전";
    }

    @Override
    public boolean bluetoothPen() {
        return false;
    }

    @Override
    public String makeCall() {
        return "번호를 누르고 통화버튼을 누름";
    }

    @Override
    public String takeCall() {
        return "수신 버튼을 누름";
    }

    @Override
    public String touch() {
        return "정전식";
    }

    public String printInformation(){
        return null;
    }
}
