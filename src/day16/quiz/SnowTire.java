package day16.quiz;

public class SnowTire extends Tire {

    @Override
    public void roll() {
        System.out.println("스노우 타이어가 회전합니다.");
    }

    public void chargeAir(){
        System.out.println("공기압을 충전합니다.");
    }
}
