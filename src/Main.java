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
        Human me = new Human("Jakub","Klik",audi);

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
        System.out.println(sony.toString());
    }


}
