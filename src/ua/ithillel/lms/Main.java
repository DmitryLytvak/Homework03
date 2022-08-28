package ua.ithillel.lms;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Ford", "Focus", 5, "Grey");
        System.out.println(car);
        car.start();


        Employee employee = new Employee("Dima", "director", "dima@gmail.com",
                "0677777777", 40);
        System.out.println(employee);
    }
}
