package day19.generic;

//제네릭 클래스
public class Basket <F> {

    private F f;
    private String owner;
    private F[] fs;

    public F getF() {
        return f;
    }

    public void setF(F f) {
        this.f = f;
    }
}
