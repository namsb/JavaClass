package org.dimigo.inheritance;

public class Teacher extends Person{
    private String subject;

    public Teacher(String name, int age, int height, int weight, String subject) {
        super(name, age, height, weight);
        this.subject = subject;
    }

    public void teach() {
        System.out.println(getName() + "선생님이 수업을 하십니다.");
    }

    public void daTask() {
        System.out.println(getName() + "선생님이 일을 하십니다.");
    }

    public String toString() {
        return "Teacher{" +
                "subject='" + subject + '\'' +
                super.toString();
    }
}
