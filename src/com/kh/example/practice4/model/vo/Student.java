package com.kh.example.practice4.model.vo;

public class Student {

    public int grade;
    public int classroom;
    public String name;
    public double height;
    public char gender;

    public Student(int nGrade, int nRoom, String nName, double nHeight, char nGender) {

        grade = nGrade;
        classroom = nRoom;
        name = nName;
        height = nHeight;
        gender = nGender;

    }

    static {
        System.out.println("이름과 학년 반, 키, 성별을 입력해주세요!");
    }


    public void information(){
        System.out.printf("이름: %s, %d학년 %d반, 키: %.1f, 성별: %c"
                ,name,grade,classroom,height,gender);

    }
}
