package devices;

import Rest.Human;
import Rest.salleable;

import java.util.List;

public class Phone extends Devices implements salleable {

    Integer price;
    static final String appAdress = "www.appServer.com";
    static final String protocol = "http";
    static final Double version = 1.0;

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

        public void installAnnApp(String name){System.out.println("Installation complete!");}

        public void installAnnApp(String name, Double version){System.out.println("Installation complete!");}

        public void installAnnApp(String name, Double version, String urlAdress){System.out.println("Installation complete!");}

        public void installAnnApp(List<String> nameList){System.out.println("Installation complete!");}

        public void installAnnApp(Object object){System.out.println("Installation complete!");}


}
