package practice3.model.vo;

public class Cat extends Animal{

    private String location;
    private String color;

    public Cat() {
    }


    @Override
    public void speak() {
        System.out.println(this.toString()+ location + " 에 서식하며, 색상은 " + color + "입니다.");

    }

    public Cat(String name, String kind, String location, String color) {
        super(name, kind);
        this.location = location;
        this.color = color;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
