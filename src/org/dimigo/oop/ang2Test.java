package org.dimigo.oop;

public class ang2Test {
    public static void main(String[] args) {
        ang2 ang1 = new ang2("현대자동차", "제네시스", "검정색", 225, 50000000);
        ang2 ang2 = new ang2("기아자동차", "K7", "흰색", 246);
        ang2 ang3 = new ang2("삼성자동차", "SM7", "회색");

        System.out.println("<< 자동차 목록 >>");
        System.out.println("제조사명 : " + ang1.getCompany());
        System.out.println("모델명 : " + ang1.getModel());
        System.out.println("색상 : " + ang1.getColor());
        System.out.println("최대속도 : " + ang1.getSpeed() + "km");
        System.out.printf("가격 : %,d원", ang1.getPrice());
        System.out.println("");

        System.out.println("<< 자동차 목록 >>");
        System.out.println("제조사명 : " + ang2.getCompany());
        System.out.println("모델명 : " + ang2.getModel());
        System.out.println("색상 : " + ang2.getColor());
        System.out.println("최대속도 : " + ang2.getSpeed() + "km");
        System.out.printf("가격 : %,d원", ang2.getPrice());
        System.out.println("");

        System.out.println("<< 자동차 목록 >>");
        System.out.println("제조사명 : " + ang3.getCompany());
        System.out.println("모델명 : " + ang3.getModel());
        System.out.println("색상 : " + ang3.getColor());
        System.out.println("최대속도 : " + ang3.getSpeed() + "km");
        System.out.printf("가격 : %,d원", ang3.getPrice());
    }
}
