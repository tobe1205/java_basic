package com.kh.practice.list.music.model.compare;

import com.kh.practice.list.music.model.vo.Music;

import java.util.Comparator;

public class AscTitle implements Comparator<Music> {

    /*
    비교결과 양수면 앞에거가 더 큼
    음수면 뒤에거가 더 큼
    0이면 같음
     */
    @Override
    public int compare(Music m1, Music m2) {
        return m1.getTitle().compareTo(m2.getTitle());
    }
}