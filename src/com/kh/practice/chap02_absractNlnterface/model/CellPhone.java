package com.kh.practice.chap02_absractNlnterface.model;

public interface CellPhone extends Phone,Camera {

    String charge(); //충전 방식 추상 메서드
}
