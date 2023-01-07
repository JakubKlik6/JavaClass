import Rest.Animal;
import Rest.Human;
import devices.Car;
import devices.Phone;

public class Main
{
    public static void main(String[] args)
    {

        Animal cat = new Animal("cat","Stefan");
        Animal dog = new Animal("dog","Barry");
        Animal elephant = new Animal("elephant","Jacek");

        cat.AnimalData();
        dog.Feed();
        dog.TakeForWalk();

        Car audi = new Car("Audi","A5",1500,"gray",1000.0);
        Human me = new Human();

        Car bmw = new Car("Bmw", "M2",0,"black", 2000.0);

        me.setSalary(150000.0);
        me.getSalary();

        me.setCar(bmw);
        System.out.println(me.getCar());

        Car audi2 = new Car("Audi","A5",1500,"gray",1000.0);
        //Equals method
        System.out.println(audi.equals(audi2));
        System.out.println(audi.equals(bmw));
        //Hash method
        System.out.println(audi.hashCode());
        System.out.println(audi2.hashCode());
        //Equals method
        System.out.println(new Car("Bmw", "M2",0,"black", 2000.0).equals(new Car("Bmw", "M2",0,"black", 2000.0)));

        //ToString
        System.out.println(cat.toString());
        System.out.println(me.toString());
        System.out.println(bmw.toString());


        Phone sony = new Phone("Sony",150);
        System.out.println(sony.toString());
        sony.TurnOn();

        Car toyota = new Car("Toyota","Prius",1500,"pink",1000.0);
        toyota.TurnOn();


        System.out.println("\nTrades:\n");
        Human person1 = new Human();
        person1.car = toyota;
        toyota.sell(person1,me,150.0);

        me.phone = sony;
        sony.sell(me,person1,50.0);

        me.pet = cat;
        cat.sell(me, person1, 20.0);

        System.out.println(me.toString());
        System.out.println(person1.toString());

    }


}
