package day15.poly.car;

public class Driver {

    public void drive(Sonata s){
        System.out.println("운전을 시작합니다.");
        s.run();
    }
    public void drive(Car c){
        System.out.println("운전을 시작합니다!");
        c.run();
    }

    //자동차를 구입하는 기능

    public Car buyCar(String carName){
        if(carName.equals("소나타")){
            System.out.println("소나타를 구매합니다.");
            return new Sonata();
        } else if (carName.equals("투싼")){
            System.out.println("소나타를 구매합니다.");
            return new Tucson();
        } else if(carName.equals("스팅어")){
            System.out.println("스팅어를 구매합니다.");
            return new Stinger();
        } else {
            System.out.println("없는 차량입니다.");
            return null;
        }
    }
}
