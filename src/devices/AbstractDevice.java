package devices;

public class AbstractDevice
{
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

    public void TurnOn(){
        mode = true;
    }
}
