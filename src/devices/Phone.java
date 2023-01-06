package devices;

public class Phone extends AbstractDevice
{

    Integer price;

    public Phone(String producer,Integer price){
        this.producer = producer;
        this.price = price;
        mode = false;
    }
}
