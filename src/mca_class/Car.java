package mca_class;

public class Car {
    int speed;
    String color;

    Car(int speed, String color){
        this.speed = speed;
        this.color = color;
    }
    static void display(Car car){
        System.out.println(car.color);
        System.out.println(car.speed);
    }

    public static void main(String[] args) {
        Car c = new Car(45, "Black");
        Car.display(c);

    }
}
