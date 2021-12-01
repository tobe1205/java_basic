package day01;

public class Casting3 {

    public static void main(String[] args) {

        // 데이터 크기가 다른 연산은 작은쪽을 큰쪽으로 자동 변환하고 연산합니다.
        char c = 'B';
        int i = 2;

        char result = (char) (c + i);
        System.out.println(result);

        System.out.println(30.0 + 50);

        // int보다 작은 데이터 (byte,short,char)타입 끼리의 연산은
        // 결과가 자동으로 int로 처리됩니다.
        byte b1 = 100;
        byte b2 = 120;
        int b3 = b1 + b2;

        
        System.out.println("============================");
        
        int n1 = 27, n2 = 5;
        double res = ((double)n1 / n2);
        System.out.println("res = " + res);
    }
}
