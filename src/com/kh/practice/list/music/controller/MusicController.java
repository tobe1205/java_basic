package com.kh.practice.list.music.controller;


import com.kh.practice.list.music.model.vo.Music;

import java.util.*;

public class MusicController {

    private List<Music> list = new ArrayList<>();

    public int addList(Music music) {
        int size = list.size();
        if(size == 0){
            size = 1;
            list.add(size - 1, music);
            return 1;
        }
        list.add(size - 1, music);
        return 1;
    }

    public int addAtZero(Music music) {
        list.add(0, music);
        return 1;
    }

    public List<Music> printAll() {
        return list;
    }

    public Music searchMusic(String title) {
        for (Music music : list) {
            if (music.getTitle().equals(title)) {
                return music;
            }
        }
        return null;
    }

    public Music removeMusic(String title) {
        for (Music music : list) {
            if (music.getTitle().equals(title)) {
                list.remove(music);
            }
        }
        return null;
    }

    public Music setMusic(String title, Music music) {
        for (Music m : list) {
            if (m.getTitle().equals(title)) {
                int index = list.indexOf(m);
                list.set(index, music);
            }
        }
        return null;
    }

    public int ascTitle() {
        list.sort(Music::compareTo);
        return 1;
    }

    public int descSinger() {
        list.sort(Comparator.reverseOrder());
        return 1;
    }
}
