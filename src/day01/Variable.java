package day01;

public class Variable {

    public static void main(String[] args) {

        //변수의 선언
        int score;

        //변수의 초기화
        score = 86;

        System.out.println(score);

        int life = 3;
        life = 7;
        System.out.println(life);

        int triple = score * 3;
        System.out.println("triple = " + triple);

        //정수: int, 실수: double, 문자열: String
        String nickname = "짹짹이";
        System.out.println("nickname = " + nickname);

//        nickname = 100; //타입에 맞지 않는 같은 계정 불가

        // 같은 범위 안에서 같은 이름 사용 불가능
    }

}
