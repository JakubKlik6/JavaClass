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


        //tablica 10 elementowa 101 - 110
        int tab[] = new int[10];

        int k = 0;

        for (int i = 101; i <= 110; i++)
        {
            tab[k++] = i;
        }
        for(int i = 0;i < 10; i ++)
        {
            System.out.println(tab[i]);
        }

        System.out.println("\n--------------------\n");

        //tablica 10 elementowa, co 10
        int tab2[] = new int[10];

        int j = 0;

        for (int i = 10; i <= 101; i += 10)
        {
            tab2[j++] = i;
        }
        for(int i = 0;i < 10; i ++)
        {
            System.out.println(tab2[i]);
        }


        //tablica typu bool
        boolean tab3[] = new boolean[20];
        for(int i = 0; i< 20;i++)
        {
            if(i % 2 == 0)
            {
                tab3[i] = true;
            }
            else tab3[i] = false;
        }
        for(int i= 0;i<10;i++){
            System.out.println(tab3[i]);
        }

        //100 elementowa tab int
        int tab4[] = new int[100];
        for(int i = 0; i< 100;i +=10){
            tab4[i] = 0;
            tab4[i+1] = 1;
            tab4[i+2] = 2;
        }
        for(int i= 0;i<99;i++)
        {
            System.out.println(tab4[i]);
        }
    }


}
