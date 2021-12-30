package day16.abs;

public abstract class Pet {

    private String name; //이름
    private String kind; //종류

    public Pet(String name, String kind) {
        this.name = name;
        this.kind = kind;
    }

    //낮잠 자는 기능
    public abstract void takeNap();
    //사료먹는 기능
    public abstract void eatFood();
}
