package creatures;

import Rest.Human;
import Rest.salleable;

public abstract class  Animal implements salleable, Feedable
{
    private static final Double DEF_DOG_WEIGHT = 10.0;
    private static final Double DEF_CAT_WEIGHT = 5.0;
    private static final Double DEF_ELEPHANT_WEIGHT = 1500.0;
    private static final Double DEF_WEIGHT = 77.0;

    String specie;
    String name;
    Boolean isAlive;
    Double weight;

    public Animal(String specie, String name)
    {

        this.specie = specie;
        this.name = name;
        this.isAlive = true;

        switch (this.specie)
        {
            case "dog":
                this.weight = DEF_DOG_WEIGHT;break;
            case "cat":
                this.weight = DEF_CAT_WEIGHT; break;
            case "elephant":
                this.weight = DEF_ELEPHANT_WEIGHT; break;
            default:
                this.weight = DEF_WEIGHT;
        }
    }

    public void AnimalData()
    {
        //System.out.println("Name: " + this.name + "\nWeight" + this.weight + "\nSpecie: " + this.specie);
        System.out.printf("\nName: %s\nWeight: %s\nSpecie: %s", this.name,this.weight,this.specie);
    }

    public void feed()
    {
        if(this.isAlive)
        {
            if (weight > 0)
            {
                weight += 1.0;
                System.out.println("\nThanks for food");
            }
            else
            {
                this.isAlive = false;
                System.out.println("\nAre u good sir?");
            }

        }
        else
        {
            System.out.println("\nAre u good sir?");
        }
    }


    public void feed(Double foodWeight)
    {

    }


    public void TakeForWalk()
    {
        if(this.isAlive)
        {
            if(weight > 0)
            {
                weight -= 1.0;
                System.out.println("\nThanks for a walk");
            }
            else
            {
                this.isAlive = false;
                System.out.println("\nCalling police");
            }
        }
        else
        {
            System.out.println("\nCalling police");
        }
    }

    @Override
    public String toString() {
        return  "specie = '" + specie + '\'' +
                ", name = '" + name + '\'' +
                ", weight = " + weight;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.pet != null){
            if (buyer.cash >= price){
                buyer.cash -= price;
                seller.cash += price;
                buyer.pet = seller.pet;
                seller.pet = null;
                System.out.println("Transaction complete");
            }
            else System.out.println("You don't have enough money");
        }
        else System.out.println("Seller dont have pet to sell");
    }

}