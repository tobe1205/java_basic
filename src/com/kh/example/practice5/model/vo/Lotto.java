package com.kh.example.practice5.model.vo;

import java.util.Arrays;
import java.util.Random;

public class Lotto {

    private int[] lotto;

    public Lotto() {
        this.lotto = new int[6];
        makeLottoNumber();
    }

    private void makeLottoNumber() {
        // 중복되지 않는 1~45사이의 6개의 정수 난수를 생성하여
        // 배열 필드 lotto에 저장
        Random r = new Random();
        for (int i = 0; i < this.lotto.length; i++) {
            int rn = r.nextInt(45) + 1;
            if(!isDuplicate(rn)) { //만약에 지금 생성된 랜덤 번호가 중복번호가 아니라면
                this.lotto[i] = rn;
            } else {
                i--;
            }
        }
    }
    private boolean isDuplicate(int rn) {
        for (int n : lotto) {
            if (rn == n) return true;
        }
        return false;
    }

    public void information() {
        System.out.println(Arrays.toString(this.lotto));
    }
}
