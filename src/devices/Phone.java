package devices;

import Rest.Human;
import Rest.salleable;

import java.util.List;

public class Phone extends Devices implements salleable {

    Integer price;
    static final String DEFAULT_SERVER_ADDRESS = "http://app.com";
    static final String protocol = "http";
    static final Double DEFAULT_VERSION = 1.0;

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

        public void installAnnApp(String appName){
            this.installAnnApp(appName,DEFAULT_VERSION);
        }

        public void installAnnApp(String appName, Double appVersion){
            this.installAnnApp(appName,appVersion,DEFAULT_SERVER_ADDRESS);
        }

        public void installAnnApp(String appName, Double appVersion, String server){
            System.out.println("Connecting with server");
            System.out.println("Downloading app");
            System.out.println("Installation Complete");
        }

        public void installAnnApp(List<String> appNames){
            for(String appName:appNames) {
                this.installAnnApp(appNames);
            }
        }

}
