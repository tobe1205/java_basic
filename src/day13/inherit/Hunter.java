package day13.inherit;

public class Hunter extends Player {

    int arrowCount;


    public Hunter(String name) {
        super(name);
    }

    @Override //오버라이딩 룰 검증
    public void info() {
        super.info();
        System.out.println("# 화살 : " + arrowCount);

    }
    public void frozenShot(){
    }
}
