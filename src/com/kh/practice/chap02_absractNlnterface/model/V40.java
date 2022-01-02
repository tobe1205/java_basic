package com.kh.practice.chap02_absractNlnterface.model;

public class V40 extends SmartPhone implements NotePen{

    public V40() {this.setMaker("LG");}

    @Override
    public String makeCall() {
        return "번호를 누르고 통화버튼을 누름";
    }

    @Override
    public String takeCall() {
        return "수신 버튼을 누름";
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
    public String touch() {
        return "정전식";
    }

    @Override
    public boolean bluetoothPen() {
        return false;
    }


    public String printInformation(){
        String tmp = "V40는 " + this.getMaker() + "에서 만들어졌고 제원은 다음과 같다.\n";
        tmp = tmp + this.makeCall() + "\n";
        tmp = tmp + this.takeCall() + "\n";
        tmp = tmp + this.picture() + "\n";
        tmp = tmp + this.charge() + "\n";
        tmp = tmp + this.touch() + "\n";
        tmp = tmp + "블루투스 펜 탑제 여부 : " + this.bluetoothPen();
        return tmp;
    }
}
