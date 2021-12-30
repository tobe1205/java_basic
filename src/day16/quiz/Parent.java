package day16.quiz;

public class Parent {

    public String nation;

    public Parent(){ // this()나 super()가 없을때 supur()를 만든다.
        this("대한민국");
        System.out.println("Parent() call");
    }

    public Parent(String nation) {
        this.nation = nation;
        System.out.println("Parent(String) call");
    }
}
