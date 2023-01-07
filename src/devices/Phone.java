package devices;
import Rest.Human;
import Rest.salleable;

public class Phone extends Devices implements salleable {

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

    @Override
    public String toString() {
        return "Producer" + producer;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.phone != null){
            if (buyer.cash >= price){
                buyer.cash -= price;
                seller.cash += price;
                buyer.phone = seller.phone;
                seller.phone = null;
                System.out.println("Transaction complete");
            }
            else System.out.println("You don't have enough money");
        }
        else System.out.println("Seller dont have phone to sell");

        }


}
