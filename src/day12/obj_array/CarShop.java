package day12.obj_array;

import day12.encap.Car;

public class CarShop {

    private String storeName; //대리점 명
    private int carAmount; //보유중인 차량 대수
    private Car[] cars;


    /**
     * @param storeName - 처음 생성시 결정할 대리점의 이름을 넣으세요.
     * @param carSpace  - 대리점이 최대 보유할 수 있는 차량의 숫자를 넣으세요.
     */
    public CarShop(String storeName, int carSpace) {
        this.storeName = storeName;
        this.cars = new Car[carSpace];
    }

    //차량 입고 기능
    public void importCar(Car car) {
        if (cars.length > carAmount) { //차고지에 공간이 있는 경우
            cars[carAmount++] = car;
            System.out.printf("[%s]의 차량이 입고되었습니다.\n", car.getModel());
        } else {
            System.out.println("차고지 공간이 충분하지 않습니다. 차량을 출고해주세요.");
        }
    }

    //차량 출고 기능
    public Car exportCar(String carName) {
        int carIndex = findCar(carName);
        if (carIndex != -1) {
            Car exported = cars[carIndex];
            for (int i = carIndex; i < carAmount -1; i++) {
                cars[i] = cars[i+1];
            }
            carAmount--;
            return exported;
        } else {
            System.out.printf("[%s]차량은 입고되지 않은 차량입니다.\n", carName);
            return null;
        }
    }

    //차량 탐색 기능
    private int findCar(String carName) {
        int index = -1;
        for (int i = 0; i < carAmount; i++) {
            if (carName.equals(cars[i].getModel())) {
                index = i;
                break;
            }
        }
        return index;
    }

    //차고지 차량 확인
    public void showAllCars(){
        System.out.printf("\n================[%s] 출고가능 차량 목록 ================\n",this.storeName);

        for (int i = 0; i < carAmount; i++) {
            System.out.printf("# %d. %s\n", i+1,cars[i].getModel());
        }
    }
}