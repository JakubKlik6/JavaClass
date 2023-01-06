package devices;

public class Phone extends Devices
{

    Integer price;


    public Phone(String producer,Integer price){
        this.producer = producer;
        this.price = price;
        mode = false;
    }

    @Override
    public void TurnOn() {
        System.out.println("Turned On");
    }
}
