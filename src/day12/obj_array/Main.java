package day12.obj_array;

import day12.encap.Car;

public class Main {

    public static void main(String[] args) {

        CarShop hyundai = new CarShop("현대자동차", 4);
        CarShop mercedes = new CarShop("메르세데스 벤츠", 3);
        CarShop kia = new CarShop("기아자동차", 5);

        Car granduer = new Car("그랜져");
        hyundai.importCar(granduer);
        hyundai.importCar(new Car("투싼"));
        hyundai.importCar(new Car("싼타페"));
        hyundai.importCar(new Car("아반떼N"));
        hyundai.importCar(new Car("소나타"));

        mercedes.importCar(new Car("C200"));
        mercedes.importCar(new Car("S63 AMG"));
        mercedes.importCar(new Car("C43 AMG"));
        mercedes.importCar(new Car("E400"));

        System.out.println("=======================");

        hyundai.showAllCars();
        Car avanteN = hyundai.exportCar("아반떼N");

        hyundai.showAllCars();
        hyundai.importCar(new Car("제네시스 쿠페"));

        hyundai.showAllCars();

        avanteN.engineStart();
        avanteN.setMode('D');
        avanteN.accelerator();

        System.out.println("===================");

        mercedes.exportCar("S63 AMG");
        mercedes.showAllCars();

    }
}
