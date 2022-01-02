package com.kh.practice.chap02_absractNlnterface.controller;

import com.kh.practice.chap02_absractNlnterface.model.GalaxyNote9;
import com.kh.practice.chap02_absractNlnterface.model.Phone;
import com.kh.practice.chap02_absractNlnterface.model.V40;

public class PhoneController{
    private String[] result = new String[2];

    public String[] method() {
        Phone[] ph = new Phone[]{new GalaxyNote9(), new V40()};
        for (int i = 0; i < ph.length; ++i) {
            if (ph[i] instanceof GalaxyNote9) {
                this.result[i] = ((GalaxyNote9) ph[i]).printInformation();
            } else if (ph[i] instanceof V40) {
                this.result[i] = ((V40) ph[i]).printInformation();

            }
        }
        return this.result;
    }
}
