package day11.modi.pac1;

public class A {

    //필드
    public int f1;
    int f2; // 아무것도 작성하지 않으면 default 제한
    private int f3;

    //메서드
    public void m1(){}
    void m2(){}
    private void m3(){}

    //생성자
    public A(){
        f1 = 1; f2 = 2; f3 = 3;
        m1(); m2(); m3();
    }
}
