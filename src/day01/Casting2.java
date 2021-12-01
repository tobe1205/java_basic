package day01;

public class Casting2 {

    public static void main(String[] args) {

        // 명시적 형변환 (downcasting)
        int n = 1000;
        byte m = (byte) n;
        System.out.println("m = " + m);

        double k = 5.556;
        int j =(int) k;
        System.out.println("j = " + j);

    }

}
