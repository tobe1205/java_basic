package day13.inherit;

public class Player extends Object {

    public String name; //이름
    public int level; //레벨
    public int hp; // 체력
    public int exp;


    public Player(String name) {
        this.name = name;
        this.level = 1;
        this.hp = 50;
    }

    public void info(){
        System.out.println("\n========== 케릭터 정보 ===========");
        System.out.println("# 아이디 : " + name);
        System.out.println("# 레벨 : " + level);
        System.out.println("# 체력 : " + hp);
    }

    public void attack() {
        System.out.println(name + "님이 공격합니다!");
    }

}
