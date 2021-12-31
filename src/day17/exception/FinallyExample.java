package day17.exception;

public class FinallyExample {
    public static void main(String[] args) {

        String[] pets = {"비둘기", "거북이", "짹짹이"};

        for (int i = 0; i < 4; i++) {
            try {
                System.out.println(pets[i] + "키울거야!");

            } catch (Exception e) {
                System.out.println("애완동물 정보가 없습니다.");
            } finally {
                System.out.println("애완동물 좋아요~!\n");
                //메모리 해제시 자주 사용 close시 (데이터베이스, 하드디스크 접근)
            }
        }

        System.out.println("프로그램 정상 종료!");
    }
}
