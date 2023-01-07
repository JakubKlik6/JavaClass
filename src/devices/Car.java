package devices;
import Rest.Human;
import Rest.salleable;

import java.util.Objects;


public class Car extends Devices implements salleable {

    final String model;
    Integer carMileage;
    String color;
    public Double value;

    public Car(String producer,String model, Integer carMileage, String color, Double value)
    {
        this.producer = producer;
        this.model = model;
        this.carMileage = carMileage;
        this.color = color;
        this.value = value;
    }

    public void CarInfo()
    {
        System.out.printf("\nProducer: %s\nModel: %s\nColor: %s\ndevices.Car mileage: %s", this.producer,this.model,this.color,this.carMileage);
    }

    @Override
    public String toString() {
        return " " + "producer = '" + producer + '\'' + ", model = '" + model + '\'' + ", car mileage = " + carMileage + ", color = '" + color + '\'';
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Car)
        {
            if(this.producer.equals(((Car) obj).producer)){
                if(this.model.equals(((Car) obj).model)){
                    if(this.color.equals(((Car) obj).color)){
                        if(this.carMileage.equals(((Car) obj).carMileage)){
                            if(this.value.equals(((Car) obj).value)){
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer, model, carMileage, color, value);
    }

    @Override
    public void TurnOn() {
        System.out.println("Turned On");
    }


    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.car != null){
            if (buyer.cash >= price){
                buyer.cash -= price;
                seller.cash += price;
                buyer.car = seller.car;
                seller.car = null;
                System.out.println("Transaction complete");
            }
            else System.out.println("You don't have enough money");
        }
        else System.out.println("Seller dont have car to sell");
    }
}
