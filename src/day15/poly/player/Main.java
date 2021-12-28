package day15.poly.player;

import day13.inherit.Hunter;
import day13.inherit.Mage;
import day13.inherit.Warrior;

public class Main {

    public static void main(String[] args) {

        Mage m = new Mage("눈보라대마법사");

        Warrior w = new Warrior("전사킹워리어");
        Hunter h = new Hunter("밀렵꾼");

        m.blizzard(w,h);
        m.blizzard(h,m,new Mage("불꽃마법사"), new Hunter("수렵왕"));


        w.fireRush(m);
        w.fireRush(h);
    }
}
