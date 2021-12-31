package day17.exception;

public class TryExample1 {
    public static void main(String[] args) {

        int n1 = 10, n2 = 0;
        System.out.println("나눗셈 시작!");

        try {
            //예외 발생 가능성이 있는 코드
            int result = n1 / n2;
            System.out.printf("%d / %d = %d\n", n1, n2, result);
        } catch (ArithmeticException e) {
            //예외 발생시 대신 실행할 코드
            System.out.println("0으로 나눌 수 없습니다.");
        }

        System.out.println("프로그램 정상 종료!");
    }
}
