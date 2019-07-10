package org.dimigo.oop;

public class arrayBasic {
    public static void main(String[] args) {
        //기본형 타입 배열
        //int float double character boolean byte long short
        int[] intArr = null;
        intArr = new int[5];

        int[] intArr2 = new int[] {1,2,3,4,5};
        printArray(intArr2);

        printArray(intArr);

        double[] doubleArr = null;
        doubleArr = new double[5];

        printArray(doubleArr);

        //참조형 배열
        String[] strArr = new String[3];
        printArray(strArr);

        strArr[0] = "허정우";
        strArr[1] = "이현선";
        strArr[2] = "임도우";
        printArray(strArr);

        String[] strArr2 = {"승리", "정준영", "로이김"};
        printArray(strArr2);

        //book 타입 배열 2개짜리
        //book 객체 생성 후 출력

        Book[] bookArr = new Book[2];
        bookArr[0] = new Book("워드마스터", "전유원", 50);
        bookArr[1] = new Book("수학의 바이블", "김재영", 100);

        printArray(bookArr);
        Book[] bookArr2 = new Book[] {
                new Book("수학의 바이블2", "김재영", 100),
                new Book("워드마스터2", "전유원", 50)
        };
        printArray(bookArr2);
    }

    private static void printArray(Book[] bookArr) {
        for(Book value : bookArr) {
            System.out.print(value.toString());
        }
        System.out.println("");
    }

    private static void printArray(int[] intArr) {
        for (int value:intArr) {
            System.out.print(value + " | ");
        }
        System.out.println("");
    }
    private static void printArray(double[] doubleArr) {
        for (double value:doubleArr) {
            System.out.print(value + " | ");
        }
        System.out.println("");
    }
    private static void printArray(String[] strArr) {
        for (String value:strArr) {
            System.out.print(value + " | ");
        }
        System.out.println("");
    }


}
