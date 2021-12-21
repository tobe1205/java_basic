package day11.player;

public class Player {

    public String name; //닉네임
    public int level; //레벨
    public int hp; //체력

    public Player(){
        this("이름없음");
        System.out.println("1번 생성자!");

    }
    public Player(String name){
        this(name,1);
        System.out.println("2번 생성자!");
//        this.name = name;

    }
    public Player(String name, int level){
        System.out.println("3번 생성자!");
        this.name = name;
        this.level = level;
        this.hp = 50;

    }
    public void attack(Player target){
        System.out.println("this = " + this);
        System.out.println("target = " + target);
        System.out.printf("%s님이 %s님을 공격합니다.\n",this.name,target.name);
        target.hp -= 10;
        this.hp -= 5;
    }
}
