package Rest;

import creatures.Animal;
import devices.Car;
import devices.Phone;


public class Human {
    public final static Integer DEFAULT_GARAGE_SIZE = 3;
    public final static Double DEFAULT_SALARY = 0.0;
    private static final Object SPECIE_OF_HUMAN = "Homo Sapiens";
    private Double salary = 1000.0;
    String firstName;
    String lastName;
    private Car[] garage;
    public Animal pet;
    public Phone phone;

    public Double cash = this.salary;

    public Human() {
        super();
        salary = DEFAULT_SALARY;
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
    }

    public Human(Integer garageSize) {
        super();
        salary = DEFAULT_SALARY;
        this.garage = new Car[garageSize];
    }

    public void WhatIsYourName() {
        System.out.println("\nMy name is" + " " + this.firstName + " " + this.lastName);
    }

    public void getSalary() {
        System.out.println("Last data check was 3 day ago, salary: " + this.salary);
    }

    public void setSalary(Double value) {
        if (value > 0) {
            System.out.println("New data was sent to accounting system");
            System.out.println("Remember to pick up your annex");
            System.out.println("ZUS and US already know about your salary change so please be honest");
        }
        this.salary += value;
    }

    public Double getValueOfCars() {
        int suma = 0;
        //sumowanie wartości wszystkich pojazdów
        for (int i = 0; i < garage.length; i++) {
            suma += garage[i].value;
        }
        return (double) suma;
    }

    public Car getCar(int parkingLotNumber) {
        //walidacja
        return this.garage[parkingLotNumber];
    }

    public void setCar(Car car, int parkingLotNumber) {
        if (car.value < this.salary) {
            System.out.println("Successful purchase , payment method: cash");
            if (parkingLotNumber >= garage.length) {
                System.out.println("sorry, ale mam za mały garaż");
            } else if (parkingLotNumber < 0) System.out.println("Ogarnij się");
            else if (this.garage[parkingLotNumber] != null) System.out.println("sorry, miejsce zajęte");
            else this.garage[parkingLotNumber] = car;
        } else if (this.salary > car.value / 12) {
            System.out.println("Successful purchase, payment method: credit");
            if (parkingLotNumber >= garage.length) {
                System.out.println("sorry, ale mam za mały garaż");
            } else if (parkingLotNumber < 0) System.out.println("Ogarnij się");
            else if (this.garage[parkingLotNumber] != null) System.out.println("sorry, miejsce zajęte");
            else this.garage[parkingLotNumber] = car;
        } else {
            System.out.println("Do something with your life because you cant afford this car :(");
        }
    }

    @Override
    public String toString() {
        return "Rest.Human" + ": " +
                "salary = " + cash +
                ", firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", pet = " + pet +
                ", phone = " + phone;
    }

    public boolean hasCar(Car car) {
        boolean hasACar = false;
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == car)
                hasACar = true;
        }
        return hasACar;
    }
}
