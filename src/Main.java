import Rest.Human;
import creatures.FarmAnimal;
import creatures.Pet;
import devices.*;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {

        Pet cat = new Pet("cat","Stefan");
        Pet dog = new Pet("dog","Barry");
        FarmAnimal elephant = new FarmAnimal("elephant","Jacek");

        cat.AnimalData();
        dog.feed();
        dog.TakeForWalk();



        Diesel audi = new Diesel("Audi","A5",1500,"gray",1000.0);
        Human me = new Human();

        LPG bmw = new LPG("Bmw", "M2",0,"black", 2000.0);

        me.setSalary(150000.0);
        me.getSalary();

        me.setCar(bmw);
        System.out.println(me.getCar());

        Electric audi2 = new Electric("Audi","A5",1500,"gray",1000.0);
        //Equals method
        System.out.println(audi.equals(audi2));
        System.out.println(audi.equals(bmw));
        //Hash method
        System.out.println(audi.hashCode());
        System.out.println(audi2.hashCode());
        //Equals method
        System.out.println(new LPG("Bmw", "M2",0,"black", 2000.0).equals(new LPG("Bmw", "M2",0,"black", 2000.0)));

        //ToString
        System.out.println(me.toString());
        System.out.println(bmw.toString());


        Phone sony = new Phone("Sony",150);
        System.out.println(sony.toString());
        sony.TurnOn();

        Electric toyota = new Electric("Toyota","Prius",1500,"pink",1000.0);
        toyota.TurnOn();


        System.out.println("\nTrades:\n");
        Human person1 = new Human();
        person1.car = toyota;
        toyota.sell(person1,me,150.0);

        me.phone = sony;
        sony.sell(me,person1,50.0);

        me.pet = cat;
        cat.sell(me,person1,20.0);

        System.out.println(me.toString());
        System.out.println(person1.toString());

        sony.installAnnApp("NBA");
        sony.installAnnApp("Instagram",1.9);
        sony.installAnnApp("Whatsapp",3.9,"www.whatsapp.com");

        List NameList = new ArrayList<String>();
        NameList.add("Instagram");
        NameList.add("NBA");

    }


}
