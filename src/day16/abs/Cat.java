package day16.abs;

public class Cat extends Pet{

    public Cat(String name, String kind) {
        super(name, kind);
    }

    @Override
    public void takeNap() {
        System.out.println("고양이는 상자에서 낮잠을 잡니다~");
    }

    @Override
    public void eatFood() {
        System.out.println("고양이는 생선사료를 먹어요~~");
    }
}
