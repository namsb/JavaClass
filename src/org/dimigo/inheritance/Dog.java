package org.dimigo.inheritance;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void wag() {
        System.out.println(name + "가 꼬리를 흔듭니다.");
    }

    public void bark() {
        System.out.println("어흥");
    }

    public void zoo() {
        System.out.println(name + "가 동물원에 있습니다.");
    }
}
