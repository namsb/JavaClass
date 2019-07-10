package org.dimigo.oop;

import java.util.Random;
import java.util.Scanner;

public class myFavorite {
    public static void main(String[] args) {
        int menu = 0;
        do {
            String[] questions = {"가장 좋아하는 가수는?", "가장 좋아하는 배우는?", "가장 좋아하는 과목은?"};
            String[] answers = {"트와이스", "조인성", "자료구조"};

            Scanner scanner = new Scanner(System.in);
            String answer;
            int num = new Random().nextInt(3);

            System.out.println("------------------");
            System.out.println("1. 질문 선택");
            System.out.println("2. 정답 공개");
            System.out.println("9. 프로그램 종료");
            System.out.println("------------------");
            System.out.printf("메뉴선택 => ");
            menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    num = new Random().nextInt(3);
                    StringBuilder sb1 = new StringBuilder(questions[num]).append(" ");
                    System.out.print(sb1);
                    answer = scanner.next();
                    if (answers[num].equals(answer)) {
                        System.out.println("정답입니다!");
                    } else {
                        System.out.println("틀렸습니다!");
                    }
                    break;
                case 2:
                    StringBuilder sb2 = new StringBuilder();
                    System.out.println("<< 정답 출력 >>");
                    for (int i = 0; i < 3; i++) {
                        sb2.append(questions[i]).append(" ");
                        sb2.append(answers[i]);
                        sb2.append("입니다\n");
                    }
                    System.out.print(sb2);
                    break;
                case 9:
                    System.out.println("Bye~");
                    break;
                default:
                    System.out.println("없는 메뉴입니다.");
                    break;
            }
        }while(menu != 9);
    }
}
