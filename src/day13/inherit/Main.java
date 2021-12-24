package day13.inherit;

public class Main {

    public static void main(String[] args) {

        Warrior w = new Warrior("키보드워리어");
        w.rage = 60;
        w.level = 5;
        w.exp = 50;

        Mage m = new Mage("마법사왕대마법사");
        m.mana = 100;
        m.hp = 70;
        m.attack();
        m.exp = 40;

        Hunter h = new Hunter("빛보다빠른화살");

        w.info();
        m.info();
        h.info();

    }

}
