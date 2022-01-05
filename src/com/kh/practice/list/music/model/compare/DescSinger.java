package com.kh.practice.list.music.model.compare;

import com.kh.practice.list.music.model.vo.Music;

import java.util.Comparator;

public class DescSinger implements Comparator<Music> {
    @Override
    public int compare(Music m1, Music m2) {
        return m1.getSinger().compareTo(m2.getSinger());
    }
}