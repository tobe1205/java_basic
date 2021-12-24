package day13.inherit;

public class Mage extends Player {

    public int mana;

    public Mage(String name) {
        super(name);
        System.out.println("Mage 객체 생성!");

    }

    @Override //오버라이딩 룰 검증
    public void info() {
        super.info();
        System.out.println("# 마력 : " + mana);

    }

    public void blizzard(){

    }
}
