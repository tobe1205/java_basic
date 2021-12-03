package day03;

public class WhileExample {

    public static void main(String[] args) {

        // 구구단 2단을 출력해야 한다.
        int line = 1;
        while (line <= 9) {
            System.out.printf("2 x %d = %d\n", line, 2 * line);
            line++;
        }
    }
}
