package ch09_classes;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.color = "빨간색";
        car1.maxSpeed = 100;

        car1.drive();
        System.out.println();
        car1.brake();
        System.out.println();
        car1.displayCarInfo();

        car2.color = "노랑색";
        car2.maxSpeed = 200;

        System.out.println();
        car2.drive();
        System.out.println();
        car2.brake();
        System.out.println();
        car2.displayCarInfo();
    }
}
