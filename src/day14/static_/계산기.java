package day14.static_;

public class 계산기 {

    String 제조사;
    String 색상;
    static double 원주율;

    void 색칠하다(String 색상) {
        this.색상 = 색상;
    }
    static double 원의_넓이를_계산하다(int 반지름) {
        return 반지름 + 반지름 * 원주율;
    }

    public static void main(String[] args) {

        계산기 샤프계산기 = new 계산기();
        계산기 파나소닉계산기 = new 계산기();

        샤프계산기.제조사 = "샤프";
        파나소닉계산기.제조사 = "파나소닉";

        System.out.println("샤프계산기 = " + 샤프계산기.제조사);
        System.out.println("파나소닉계산기 = " + 파나소닉계산기.제조사);

        샤프계산기.색칠하다("빨강");
//        계산기.색칠하다("파랑");
        계산기.원의_넓이를_계산하다(10);

    }
}
