package com.kh.practice.list.music.controller;

import com.kh.practice.list.music.model.compare.AscTitle;
import com.kh.practice.list.music.model.compare.DescSinger;
import com.kh.practice.list.music.model.vo.Music;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MusicController {

    private static final List<Music> musicList = new ArrayList<>();

    public MusicController() {
        musicList.add(new Music("Gee", "소녀시대"));
        musicList.add(new Music("Black Mamba", "aespa"));
        musicList.add(new Music("링딩동", "샤이니"));
    }

    public int addList(Music music) {
        musicList.add(music);
        return 1;
    }
    public int addAtZero(Music music) {
        musicList.add(0, music);
        return 1;
    }
    public List<Music> printAll() {
        return musicList;
    }
    public Music searchMusic(String title) {
        for (Music music : musicList) {
            if (music.getTitle().equals(title)) {
                return music;
            }
        }
        return null;
    }
    public Music removeMusic(String title) {
        Music searchMusic = searchMusic(title);
        if (searchMusic != null) {
            musicList.remove(searchMusic);
        }
        return searchMusic;
    }
    public Music setMusic(String title, Music music) {
        Music searchMusic = searchMusic(title);
        if (searchMusic != null) {
            musicList.set(musicList.indexOf(searchMusic), music);
        }
        return searchMusic;
    }
    public int ascTitle() {
        Collections.sort(musicList, new AscTitle());
        return 1;
    }
    public int descSinger() {
        Collections.sort(musicList, new DescSinger().reversed());
        return 1;
    }
}