package devices;

public class LPG extends Car{
    public LPG(String producer, String model, Integer carMileage, String color, Double value) {
        super(producer, model, carMileage, color, value);
    }

    @Override
    public void refuel() {

    }
}
