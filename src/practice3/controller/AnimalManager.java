package practice3.controller;

import practice3.model.vo.Animal;
import practice3.model.vo.Cat;
import practice3.model.vo.Dog;

public class AnimalManager {
    public static void main(String[] args) {

        Animal[] animals = new Animal[5];


        animals[0] = new Cat("야옹이","페르시안고양이","한국","갈색");
        animals[1] = new Dog("뿌꾸","닥스훈트",4);
        animals[2] = new Dog("갑돌이","진돗개",3);
        animals[3] = new Cat("나비","페르시안고양이","미국","검은색");
        animals[4] = new Dog("뿌꾸","닥스훈트",4);


        for (Animal a : animals) {
            a.speak();
        }
        }
    }
