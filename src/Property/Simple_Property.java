package Property;
import java.util.Collections;
import java.util.List;

public class Simple_Property implements Property
{
    private int id;
    private Address location;
    private Status status;
    private double price;
    private int sqm;

    public Simple_Property(int id, Address location, Status status, double price, int sqm)
    {
        this.id = id;
        this.location = location;
        this.status = status;
        this.price = price;
        this.sqm = sqm;
    }


    @Override
    public int getId() {
        return id;
    }

    @Override
    public Address getLocation() {
        return location;
    }

    @Override
    public Status getStatus() {
        return status;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getSqm() {
        return sqm;
    }

    @Override
    public void setStatus(Status new_status) {
        this.status = new_status;

    }

    @Override
    public void add(Property property)
    {
        throw new UnsupportedOperationException("SimpleProperty cannot contain sub-properties.");
    }

    @Override
    public void remove(Property property)
    {
        throw new UnsupportedOperationException("SimpleProperty cannot contain sub-properties.");
    }

    @Override
    public List<Property> getSubProperties() {
        return Collections.emptyList();
    }

    @Override
    public String Property_information() {
        return "Property #" + id + " at " + location.getAddress() + " | " + sqm + " sqm | $" + price + " | " + status;
    }
}
