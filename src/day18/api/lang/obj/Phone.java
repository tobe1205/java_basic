package day18.api.lang.obj;

public class Phone {

    String name;
    String company;
    int price;

    public Phone(String name, String company, int price) {
        this.name = name;
        this.company = company;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof Phone){
            Phone target = (Phone) obj;
            return this.company.equals(target.company);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", price=" + price +
                '}';
    }
}
