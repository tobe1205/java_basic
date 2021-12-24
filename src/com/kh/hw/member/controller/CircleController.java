package com.kh.hw.member.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class CircleController {

    private Math math;
    double pi = math.PI;
    Rectangle r = new Rectangle();

    public String calcArea(int x, int y, int radius) {
        return String.format("면적 : %f * %d * %d",pi,radius,radius);
    }
    public String calcCircum(int x, int y, int radius){
        return String.format("둘레 : %f * %d * %d", pi,radius,2);
    }

}
