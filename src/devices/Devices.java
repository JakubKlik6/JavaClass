package devices;

public abstract class Devices {
    String producer;
    Boolean mode = false;
    Integer yearOfProduction = 2000;


    @Override
    public String toString() {
        return "AbstractDevice{" +
                "\nproducer: " + producer +
                "\nmode: " + mode + '\'' +
                "\nYear of production: " + yearOfProduction;
    }

    public abstract void TurnOn();
}
