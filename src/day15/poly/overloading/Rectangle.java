package day15.poly.overloading;

public class Rectangle {

    //정사각형의 넓이를 구하는 기능


    //calcArea(int)
    public int calcArea(int length){
        return length * length;
    }

    //calcArea(int)
//    public void calcArea(int a){}


    //calcArea(int,int)
    //직사각형의 넓이를 구하는 기능
    public int calcArea(int width, int height){
        return width * height;
    }

    public String calcArea(double x, int y){
        System.out.println("");
        return null;

    }

}
