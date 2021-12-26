package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;


public class RectangleController {

    private Rectangle r = new Rectangle();


    public String calcArea(int x, int y, int height, int width) {
        return String.format("면적 : %d, %d %d %d / %d", x, y,height,width,height*width);
    }
    public String calcPerimeter(int x, int y,int height,int width){
        return String.format("둘레 : %d, %d %d %d / %d",x,y,height,width,2*(width+height));
    }

}

