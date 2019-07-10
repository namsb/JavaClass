package org.dimigo.oop2;

public class Person {
    //final : 상수
    //private final String type = "포유류"; //이때 변경불가하고, 변수마다 만들어진다.
    //static final : 진정한 상수
    private final String birth;
    private String name;
    public static final String TYPE = "포유류";

    public Person(String birth, String name) {
        this.birth = birth;
        this.name = name;
    }

    public String toString() {
        return "Person{" +
                "type='" + TYPE + '\'' +
                ", birth='" + birth + '\'' +
                ", name='" + name + '\'' + '}';
    }

    public static void main(String[] args) {
        Person p1 = new Person("20020521", "남승빈");
        Person p2 = new Person("20020706", "현승현");

        System.out.println(p1);
        System.out.println(p2);

        //p1.type = "영장류";
        System.out.println(Person.TYPE);
    }
}
