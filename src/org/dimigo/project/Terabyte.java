package org.dimigo.project;

public class Terabyte {
    import java.io.*;

    interface IEngine {
        void startEngine();
        void stopEngine();
    }

    class Car {
        private IEngine engine;

        public void setEngine(IEngine engine) {
            this.engine = engine;
        }

        public void start() {
            engine.startEngine();
        }
        public void stop() {
            engine.stopEngine();
        }
    }

    class BenzEngine implements IEngine {
        public void startEngine() {
            System.out.println("Benz 엔진 가동");
        }
        public void stopEngine() {
            System.out.println("Benz 엔진 멈춤");
        }
    }

    class BMWEngine implements IEngine {
        public void startEngine() {
            System.out.println("BMW 엔진 가동");
        }
        public void stopEngine() {
            System.out.println("BMW 엔진 멈춤");
        }
    }


    class Main {
        public static void main(String[] args) {
            Car car = new Car();
            car.setEngine(new BenzEngine());
            car.start();
            car.stop();
            System.out.println("=== 엔진 교체 ===");
            car.setEngine(new BMWEngine());
            car.start();
            car.stop();
        }
    }
}
