package devices;

public class Diesel extends Car{
    public Diesel(String producer, String model, Integer carMileage, String color, Double value) {
        super(producer, model, carMileage, color, value);
    }

    @Override
    public void refuel() {

    }
}
