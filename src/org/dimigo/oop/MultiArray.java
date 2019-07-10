package org.dimigo.oop;

public class MultiArray {
    public static void main(String[] args) {
        int[][] intArr = new int[2][3];
        printArray(intArr);

        intArr[0][2] = 1;
        intArr[1][1] = 2;
    }

    private static void printArray(int[][] intArr) {
        //이중 for문 출력
        /*for(int i=0; i<intArr.length; i++) {
            for(int j=0; j<intArr[i].length; j++) {
                System.out.print(intArr[i][j] + " | ");
            }
            System.out.println("");
        }*/
        for(int[] a :intArr) {
            for(int b : a){
                System.out.print(b + " | ");
            }
            System.out.println("");
        }

        String[][] strArr = new String[2][];
        strArr[0] = new String[3];
        strArr[1] = new String[2];
        strArr[0][0] = "C";
        strArr[0][1] = "JAVA";
        strArr[0][2] = "PHP";
        strArr[1][0] = "C#";
        strArr[1][1] = "R";

        printArray(strArr);
    }
    private static void printArray(String[][] strArr) {
        for(String[] a :strArr) {
            for(String b : a){
                System.out.print(b + " | ");
            }
            System.out.println("");
        }
    }
}
