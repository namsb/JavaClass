package org.dimigo.oop2;

public class Singleton {
    private static Singleton instance = new Singleton();

    //new로 객체생성 못함
    private Singleton() {

    }

    public static Singleton getInstance() {
        return instance;
    };

    //lazy initialization
    public static synchronized Singleton getInstance2() {
      if(instance == null) {
          instance = new Singleton();
      }
      return instance;
    };

//    static {
//        instance = new Singleton();
//    }
}
