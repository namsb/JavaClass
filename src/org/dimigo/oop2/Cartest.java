package org.dimigo.oop2;

public class Cartest {
    public static void main(String[] args) {
        Car[] cars = {
//                new Car("제네시스"),
//                new Car("그랜저"),
//                new Car("아반떼")
        };

        //Car.setCompany("현대");
        //cars[0].setCompany("현대"); // 이렇게 써도 static은 하나기 때문에 전부 바뀌긴 한다.
        for(Car car : cars){
            System.out.println(car);
        }

        System.out.println(Math.sin(Math.toRadians(30)));
    }
}
