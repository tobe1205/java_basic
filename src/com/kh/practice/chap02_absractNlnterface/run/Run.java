package com.kh.practice.chap02_absractNlnterface.run;

import com.kh.practice.chap02_absractNlnterface.controller.PhoneController;

public class Run {

    public Run() {
    }
    public static void main(String[] args) {

        PhoneController pc = new PhoneController();

        for (int i = 0; i < pc.method().length; i++) {
            System.out.println(pc.method()[i]);
            System.out.println();

        }
    }
}
