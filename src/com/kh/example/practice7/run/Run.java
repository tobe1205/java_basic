package com.kh.example.practice7.run;

import com.kh.example.practice7.model.vo.Employee;

public class Run {

    public static void main(String[] args) {

        Employee e1 = new Employee(100, "홍길동", "영업부", "과장", 25, '남', 2500000, 0.05, "010-1234-5678", "서울시 강남구");
        e1.information();

        Employee e2 = new Employee(110, "김철수");
        e2.information();  // 기본값: 부서없음, 직급없음, 0, 성별없음, 0, 0.0, 전화번호없음, 주소없음

        Employee e3 = new Employee();
        e3.information();  // 기본값: 0, 이름없음, 부서없음, 직급없음, 0, 성별없음, 0, 0.0, 전화번호없음, 주소없음
    }
}
