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

    public void fireRush(Player... targets) {
        int damage = 0;
        for (Player p : targets) {
            if (p instanceof Mage) {
                damage = 20;
                p.hp -= damage;
            } else if (p instanceof Hunter) {
                damage = 15;
                p.hp -= damage;
            } else if (p instanceof Warrior) {
                damage = 10;
                p.hp -= damage;
            } else {
                damage = 0;
                p.hp -= damage;
            }
            System.out.println("===========================================");
            System.out.printf("%s님이 %s님에게 FireRush를 시전했습니다!\n", this.name, p.name);
            System.out.printf("%s님이 %d의 피해를 입었습니다.\n", p.name, damage);
            System.out.printf("%s님의 현재 체력 : %d\n", p.name, p.hp);
        }

    }

}

