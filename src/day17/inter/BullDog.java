package day17.inter;

public class BullDog extends Animal implements Pet,Huntable {

    @Override
    public void eat() {
        System.out.println("불독은 잡식입니다~");
    }

    @Override
    public void hunt(String target) {
        System.out.println("불독은 사납게 사냥해요~");
    }

    @Override
    public void play() {
        System.out.println("불독은 방방거리면서 놀아요~");
    }
}
