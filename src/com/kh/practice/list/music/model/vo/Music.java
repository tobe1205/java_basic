package com.kh.practice.list.music.model.vo;

import com.kh.practice.list.music.model.compare.AscTitle;

import java.util.Objects;

public class Music implements Comparable<Music> {

    private String title;
    private String singer;

    public Music() {
    }

    public Music(String title, String singer) {
        this.title = title;
        this.singer = singer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Music music = (Music) o;
        return Objects.equals(title, music.title) && Objects.equals(singer, music.singer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, singer);
    }

    public int compareTo(Music m){
        //제목비교
        //비교대상1
        String m1 = this.title;
        //비교대상2
        String m2 = m.title;

        if (m1.equals(m2)) return 0;
        else if (m1.compareTo(m2) >= 1) return 1;
        else return -1;
    }
}
