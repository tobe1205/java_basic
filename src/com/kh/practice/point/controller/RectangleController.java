package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;


public class RectangleController {

    Rectangle r = new Rectangle();


    public String calcArea(int x, int y, int height, int width) {
        return String.format("면적 : %d * %d", height, width);
    }
    public String calcPerimeter(int x, int y,int height,int width){
        return String.format("둘레 : %d * (%d + %d)",2,width,height);
    }

}

