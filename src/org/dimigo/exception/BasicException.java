package org.dimigo.exception;

import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BasicException {
    public static void main(String[] args) {
        uncheckedException(null);
        checkedException();
        String id = null;
        validate(id);
    }

    private static void validate(String id) {
        if(id == null || "".equals(id)){
            Exception e = new Exception("ID를 입력하세요.");
            //throw e;
        }
    }

    // 컴파일러가 강제적으로 예외처리를 요구하지 않음
    // 개발자가 알아서 예외처리를 해줘야 함
    public static void uncheckedException(String s) {
        try {
            System.out.println(s.length());
            Integer.parseInt("123a");
        } catch (NullPointerException npe) {
            System.out.println("문자열이 입력되지 않았습니다.");
        } catch (NumberFormatException nfe) {
            System.out.println("숫자가 아닙니다.");
            nfe.printStackTrace();
        } catch (Exception e) {
            System.out.println("알 수 없는 오류입니다.");
        }
    }
    public static void checkedException() {
        try{
            BufferedReader br = new BufferedReader(
                    new FileReader("input.txt"));
            String str;
//            while ((str = br.readLine()) != null) {
//                System.out.println(str);
//            }
        } catch (FileNotFoundException fne) {
            System.out.println("파일이 없습니다.");
        }

    }
}
