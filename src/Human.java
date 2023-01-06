import devices.Car;

public class Human
{
    private Double salary = 0.0;
    String firstName;
    String lastName;
    public Car car;
    Animal pet;

    public Human(String firstName,String lastName, Car car)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.car = car;
    }

    public void WhatIsYourName()
    {
        System.out.println("\nMy name is" + " " + this.firstName + " " + this.lastName);
    }

    public void getSalary()
    {
        System.out.println("Last data check was 3 day ago, salary: " + this.salary);
    }

    public void setSalary(Double value)
    {
        if(value > 0)
        {
            System.out.println("New data was sent to accounting system");
            System.out.println("Remember to pick up your annex");
            System.out.println("ZUS and US already know about your salary change so please be honest");
        }
        this.salary += value;
    }

    public Car getCar()
    {
        return this.car;
    }

    public void setCar(Car car)
    {
        if (car.value < this.salary)
        {
            System.out.println("Successful purchase , payment method: cash");
            this.car = car;
        }
        else if (this.salary > car.value / 12 )
        {
            System.out.println("Successful purchase, payment method: credit");
            this.car = car;
        }
        else
        {
            System.out.println("Do something with your life because you cant afford this car :(");
        }
    }

    @Override
    public String toString() {
        return "Human" + ": "+
                "salary = " + salary +
                ", firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", car = " + car +
                ", pet = " + pet;
    }
}
