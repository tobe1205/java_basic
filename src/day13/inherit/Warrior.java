package day13.inherit;

public class Warrior extends Player {

    public int rage; // 분노


    public Warrior(String name) {
        super(name);
        System.out.println("Warrior 객체 생성!");

        this.rage = 100;
    }


    @Override //오버라이딩 룰 검증
    public void info() {
        super.info();
        System.out.println("# 분노 : " + rage);

    }

    public void fireRush() {
    }

}
