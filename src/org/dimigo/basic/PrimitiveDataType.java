package org.dimigo.basic;

public class PrimitiveDataType {
    static boolean flag;

    public static void main(String[] args) {
        // 논리형

        if(flag){
            System.out.println("참입니다");
        }
        else{
            System.out.println("거짓입니다");
        }

        System.out.println(flag ? "참입니다!" : "거짓입니다!");

        // 문자형
        char c1 = 'A';
        char c2 = 65;
        char c3 = '\u0041';

        System.out.printf("%c, %c, %c\n", c1, c2, c3);
        System.out.println('뷁');

        // 문자열
        String name = "남승빈";
        System.out.println("My name is " + name);

        // 정수형
        int i1 = 10;
        int i2 = 0b00001010;
        int i3 = 012;
        int i4 = 0x0A;
        System.out.printf("%d, %d, %d, %d\n", i1, i2, i3, i4);

        // byte (-128 ~ 127)
        byte b1 = -128;
        byte b2 = 127;

        b1--;
        b2++;
        System.out.println(b1);
        System.out.println(b2);

        //정수의 범위
        System.out.println(Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);
        System.out.println(Long.MIN_VALUE + "~" + Long.MAX_VALUE);

        // 100 억을 저장하려면?
        long l = 10000000000l;

        // 실수형
        float f1 = 3.14f;
        double d1 = 3.14;

        //실수 정밀도 테스트
        float f2 = 0.1234567890123456789f;
        double d2 = 0.1234567890123456789;
        System.out.println(f2);
        System.out.println(d2);

        System.out.printf("%c, %d, %.2f, %s\n", 'A', 100, 12.345, "자바조아");
    }
}
