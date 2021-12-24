package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class CircleController {

    private Math math;
    double pi = math.PI;


    public String calcCircum(int x, int y, int radius){
        return String.format("둘레 : %d, %d, %d / %.15f", x,y,radius,pi*radius*2);

    }

    public String calcArea(int x, int y, int radius) {
        return String.format("면적 : %d, %d, %d / %.15f",x,y,radius,pi*radius*radius);
    }



    }
