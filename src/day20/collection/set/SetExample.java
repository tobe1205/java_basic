package day20.collection.set;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        //Set: 중복 저장 허용X, 순서없는 빠른저장, 전체탐색이 빠름
        Set<String> set = new HashSet<>();

        //add(obj): set에 객체 추가
        set.add("김말이");
        set.add("닭강정");
        set.add("단무지");
        boolean b1 = set.add("김밥");
        boolean b2 = set.add("김말이");

        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);

        //set에 저장된 객체 수 확인
        int size = set.size();
        System.out.println("size = " + size);
        System.out.println(set);

        //set 반복문 처리
        System.out.println("===============================");
        for (String s : set) {
            System.out.println(s);
        }

        // remove(obj) : set의 객체 삭제
        set.remove("단무지");
        System.out.println(set);

        set.clear();
        System.out.println(set.isEmpty());
        System.out.println(set);

    }
}
