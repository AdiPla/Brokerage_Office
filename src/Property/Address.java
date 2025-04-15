package Property;

public class Address
{
    private int street;
    private int evenue;

    public Address(int street, int evenue)
    {
        this.street = street;
        this.evenue = evenue;
    }

    public int getStreet(){
         return street;
    }

    public int getEvenue(){
        return evenue;
    }

    public String getAddress(){
        return "(" + street + "," + evenue + ")";
    }
}
