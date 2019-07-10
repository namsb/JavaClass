package org.dimigo.basic;

public class TypeCasting {
    public static void main(String[] args) {
        // 자동형변환 : 작은 타입 -> 큰 타입
        byte b = 10;
        short s = b;
        int i = s;
        long l = i;


        // 강제 형변환 : 큰타입 -> 작은 타입
        l = 10000000000l;
        i = (int)l;
        s = (short)i;
        b = (byte)s;

        System.out.printf("%d %d %d %d", b, s, i, l);
        System.out.println();

        int i1 = 128;
        byte b1 = (byte)i1;
        System.out.printf("%d", b1);
    }
}
