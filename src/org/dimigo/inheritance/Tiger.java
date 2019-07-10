package org.dimigo.inheritance;

public class Tiger extends Animal {
    public Tiger(String name) {
        super(name);
    }

    public void bark() {
        System.out.println("어흥");
    }

    public void nap() {
        System.out.println(name + "이 낮잠니다.");
    }
}
