public class Animal
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

    public void Feed()
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
        return "Animal" + ": " +
                "specie = '" + specie + '\'' +
                ", name = '" + name + '\'' +
                ", isAlive = " + isAlive +
                ", weight = " + weight;
    }
}