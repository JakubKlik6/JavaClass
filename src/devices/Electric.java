package devices;

public class Electric extends Car{
    public Electric(String producer, String model, Integer carMileage, String color, Double value) {
        super(producer, model, carMileage, color, value);
    }

    @Override
    public void refuel() {

    }
}
