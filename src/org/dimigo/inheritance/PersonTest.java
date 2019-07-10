package org.dimigo.inheritance;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person("1", 2, 3, 4);
        Students s = new Students("남승빈", 18, 173, 63, "172407");
        Teacher t = new Teacher("지은혜", 35, 161, 55, "comnea");
        System.out.println(p);
        p.eat();
        p.sleep();
    }
}
