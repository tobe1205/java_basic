package day17.inter;

public class Tiger extends Animal implements Huntable {

    String name;
    String kind;
    int grade; //천연기념물 등급

    @Override
    public void hunt(String target) {
        System.out.println("호랑이는 은밀하게 사냥해요~!");
    }

    @Override
    public void eat() {
        System.out.println("호랑이는 고기를 먹어요!");
    }
}
