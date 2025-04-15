package Property;
import java.util.List;

public interface Property {
    int getId();
    Address getLocation();
    Status getStatus();
    double getPrice();
    int getSqm();

    void setStatus(Status status);
    void add(Property property);
    void remove(Property property);


    String Property_information();
    List<Property> getSubProperties();

}


