package day09;

/*
   1. 자바의 함수는 클래스 내부, 함수 외부에 정의합니다.
   2. 함수의 호출은 메서드 내부에서만 가능합니다.
 */

public class MethodBasic {

    // 1 ~ x까지의 총합을 구하는 함수 정의
    static int calcTotal(int x) {
        System.out.println("함수 호출!");
        int total = 0;
        for (int n = 1; n <= x; n++) {
            total += n;
        }
        return total;
    }


    public static void main(String[] args) {

        //함수 호출
        int result = calcTotal(10);
        System.out.println("result = " + result);

        int result2 = calcTotal(100);
        System.out.println("result2 = " + result2);

    } //end main method

}// end class
