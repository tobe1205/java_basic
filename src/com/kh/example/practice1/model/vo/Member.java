package com.kh.example.practice1.model.vo;

public class Member {

    //필드
    public String memberId;
    public String memberPwd;
    public String memberName;
    public int age;
    public char gender;
    public String phone;
    public String email;

    //생성자
    public Member(String name, int mAge, String nPhone) {
        memberName = name;
        age = mAge;
        phone = nPhone;

    }

    //메서드
    public void changeName(String name) {
        memberName = name;

    }

    public void printName() {
        System.out.println(memberName);
    }

    public void information() {
        System.out.printf("이름: %s, 나이: %d세, 전화번호: %s\n"
                , memberName, age, phone);
    }
}
