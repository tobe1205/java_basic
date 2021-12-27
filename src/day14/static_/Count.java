package day14.static_;

public class Count {


    public int x;         //인스턴스 필드
    public static int y; //스태틱 필드

    public Count(){
        x = 10;
    }
    static {
        y = 20;
    }
    //인스턴스 메서드
    public void m1() {
        System.out.println("x = " + this.x);
        System.out.println("y = " + this.y);
    }

    //스태틱 메서드
    public static void m2() {

//        System.out.println("x = " + x);
        System.out.println("y = " + y);
//        m1();

        Count ccc = new Count();
        ccc.x = 10;

    }

}
