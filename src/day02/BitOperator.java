package day02;

public class BitOperator {

    public static void main(String[] args) {

        //비트 연산자
        byte a = 5; //  00000101
        byte b = 3; //  00000011

        // & (비트곱) : 각 자리수를 곱하세요.
        System.out.println(a & b); // 0000 0001
        // | (비트합) : 각 자리수를 더하세요, 단 1+1 = 1로 처리하세요.
        System.out.println(a | b); // 0000 0111
        // ^ (베타적논리합) : 다르면 1 같으면 0
        System.out.println(a ^ b); // 0000 0110

        // 비트 이동 연산
        // 왼쪽방향 이동: 2의 이동숫자 제곱만큼 곱해라
        // 오른쪽방향 이동: 2의 이동숫자 제곱만큼 나눠라
        int x = 192;
        System.out.println(x << 3);
        System.out.println(x >> 2);

        //비트 반전
        int y = 8;
        System.out.println(~y);


    }
}
