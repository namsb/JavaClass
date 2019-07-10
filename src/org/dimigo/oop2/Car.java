package org.dimigo.oop2;

public class Car {
    //정적 필드ㅡㅡㅡㅡ 회사는 다 같게 정함
    private static String company;
    //인스턴스 필드ㅡㅡ 각 객체마다 이름을 다르게 정하기 위함
    private String name;

    //static block
    static {
        company = "KIA";
        System.out.println("static block call");
    }

    private Car(String name) {
        this.name = name;
        System.out.println("생성자 call");
    }

    public String toString() {
        return company + " : " + name;
    }

    public static String getCompany() {
        return company;
    }

    public static void setCompany(String company) {
        Car.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
