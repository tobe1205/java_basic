package day02;

public class StdOutput {

    public static void main(String[] args) {

        String dog = "멍멍이";
        String cat = "야옹이";

        System.out.print(dog + "\n");
        System.out.println(cat);

        int month = 12;
        int day = 25;
        String anni = "크리스마스";

        System.out.println(month + "월 " + day + "일은 " + anni + "입니다.");
        System.out.printf("%d월 %d일은 %s입니다.\n", month, day, anni);
        System.out.println("안뇽하세요!!!");

        // %f는 강제로 소수점 6자리까지 표현합니다.
        double saleRate = 0.2545; //반올림해서 보여준다.
        System.out.printf("할인비율: %.2f\n", saleRate);
        System.out.printf("할인비율: %.2f%%\n", saleRate * 100);

    }
}
