package org.dimigo.basic;

public class Operater {
    public static void main(String[] args) {
        // 1.산술연산자
        int a = 5, b = 2;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        //2.5를 만들려면?
        System.out.println((double)a / b);
        System.out.println(a * 1.0 / b);
        //0으로 나누면?
//        System.out.println(a / 0);

        //2. 다른 타입간의 연산
        int i = 10;
        double d = 3.14;
        int r = (int)(i + d);

        //3. int보다 작은 타입간의 연산
        short s1 = 1, s2 = 2;
        short s3 = (short)(s1 + s2);
        int s = s1 + s2;

        boolean flag = true;
        a = 10;
        b = 0;

        if(flag || (a/b==0)){
            System.out.println("OR 연산");
        }
        if(!flag && (a/b == 0)){
            System.out.println("AND 연산");
        }

        //4. 문자열 이어 쓰기
        String school = "dimigo";
        int grade = 2;
        int group = 4;
        String name = "NSB";

        System.out.println(school + grade + group + name);
        System.out.println(grade + (group + school) + name);
    }
}
