package day14.static_;

public class Main {

    public static void main(String[] args) {

        Count.y++;
        System.out.println(Count.y);

        System.out.println("==================");
//        c1.x = 10;
        Count.y = 11;//static 멤버는 객체생성 없이 사용 가능.
        Count.m2(); // static 메서드도 객체생성 없이 사용 가능.

        Count c1 = new Count();
        Count c2 = new Count();

        c1.x = 5;
        c2.x++;

        System.out.println("c1.x = " + c1.x);
        System.out.println("c2.x = " + c2.x);

        Count.y = 10;
        Count.y--;
        Count.y -= 5;

        System.out.println("c1.y = " + Count.y);
        System.out.println("c2.y = " + Count.y);

        c1.m1();
        c2.m1();

        Count.m2();
    }
}
