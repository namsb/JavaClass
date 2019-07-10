package org.dimigo.inheritance;

public class Students extends Person {
    private String studentsId;

    public Students(String name, int age, int height, int weight, String studentsId) {
        super(name, age, height, weight);
        this.studentsId = studentsId;
    }

    public void study() {
        System.out.println(getName() + "이 공부를 합니다.");
    }

    public void exam() {
        System.out.println(getName() + "이 시험을 봅니다.");
    }

    public String toString() {
        return "Students{" +
                "studentsId='" + studentsId + '\'' +
                super.toString();
    }
}
