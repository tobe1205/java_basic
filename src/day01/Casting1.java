package day01;

public class Casting1 {

    public static void main(String[] args) {

        // 암시적 형변환 (upcasting, promotion)
        byte a = 100; // 용량은 1byte

        int b = a;
        System.out.println(b);
        
        double c = b;
        System.out.println("c = " + c);

    }
}
