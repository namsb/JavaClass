package org.dimigo.inheritance;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal("동물");
        System.out.println(a);
        a.eat();
        a.sleep();
        a.bark();

        Dog d = new Dog("흰둥이");
        System.out.println(d);
        d.bark();
        d.wag();

        Cat c = new Cat("루루");
        System.out.println(c);
        c.scratch();
        c.bark();

        Tiger t = new Tiger("켈로그");
        System.out.println(t);
        t.bark();
        t.nap();
    }
}
