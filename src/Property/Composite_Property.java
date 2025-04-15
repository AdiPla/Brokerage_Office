package Property;

import java.util.ArrayList;
import java.util.List;

public class Composite_Property implements Property
{
    private int id;
    private Address location;
    private Status status;
    private List<Property> subProperties;

    public Composite_Property(int id, Address location, Status status)
    {
        this.id = id;
        this.location = location;
        this.status = status;
        this.subProperties = new ArrayList<>();
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
    public double getPrice()
    {
        double total = 0;
        for(Property p : subProperties){
            total += p.getPrice();
        }
        return total;
    }

    @Override
    public int getSqm()
    {
        int total = 0;
        for(Property p : subProperties){
            total += p.getSqm();
        }
        return total;
    }

    @Override
    public void setStatus(Status new_status)
    {
        this.status = new_status;
        for (Property p : subProperties){
            p.setStatus(new_status);
        }
    }

    @Override
    public void add(Property property)
    {
        subProperties.add(property);
    }

    @Override
    public void remove(Property property) {
        subProperties.remove(property);
    }

    @Override
    public List<Property> getSubProperties()
    {
        return subProperties;
    }

    @Override
    public String Property_information()
    {
        return "Composite Property #" + id + " at " + location.getAddress() +
                " | Total Area: " + getSqm() + " sqm | Total Price: " + getPrice() +
                "$ | Status: " + status +
                "\nContains: " + subProperties.size() + " sub-properties.";
    }
}
