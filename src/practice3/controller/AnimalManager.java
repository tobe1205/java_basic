package practice3.controller;

import practice3.model.vo.Animal;
import practice3.model.vo.Cat;
import practice3.model.vo.Dog;

public class AnimalManager {
    public static void main(String[] args) {

        Animal[] animals = new Animal[5];

        Cat c = new Cat("야옹이","페르시안고양이","한국","갈색");
        Dog d = new Dog("뿌꾸","닥스훈트",4);
        Dog dog = new Dog("갑돌이","진돗개",3);
        Cat cat = new Cat("나비","페르시안고양이","미국","검은색");
        Dog dog1 = new Dog("뿌꾸","닥스훈트",4);

        animals[0] = c;
        animals[1] = d;
        animals[2] = dog;
        animals[3] = cat;
        animals[4] = dog1;


        for (int i = 0; i < animals.length; i++) {
            animals[i].speak();
        }
    }
}
