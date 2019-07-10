package org.dimigo.inheritance;

public class Galaxy extends SmartPhone {
    public Galaxy() {     }
    public Galaxy(String model, String company, int price) { super(model, company, price); }

    @Override
    public void pay() {
        System.out.println("삼성페이로 결재합니다.");
    }

    public void wirelessCharge() {
        System.out.println("무선 충전 기능을 이용합니다.");
    }
}
