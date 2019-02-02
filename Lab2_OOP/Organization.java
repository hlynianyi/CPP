package CPP.Lab2_OOP;

/*
Parent class.
Here will be described the entities that are peculiar to all classes of heirs.
 */

public class Organization {
    private String name;
    private String industry;
    private String theFounder;
    private int foundationYear;
    private String shortDescription;
    private int numberOfEmployees;
    private String location;
    private String keyPersons;

    public Organization(){
        name = "Undefined";
        industry = "None";
        theFounder = "None";
        foundationYear = 0;
        shortDescription = "Empty";
        numberOfEmployees = 0;
        location = "Planet Earth";
        keyPersons = "None";
    }
    public Organization(String name, String industry, String theFounder,
                        int foundationYear, String shortDescription, int numberOfEmployees, String location, String keyPersons){
        this.name=name;
        this.industry=industry;
        this.theFounder=theFounder;
        this.foundationYear=foundationYear;
        this.shortDescription=shortDescription;
        this.numberOfEmployees=numberOfEmployees;
        this.location = location;
        this.keyPersons = keyPersons;
    }

    // override method of class Object - toString()
    @Override
    public String toString() {
        return "\nThe object belongs to the " + getClass()
                + "\nName: " + name + "."
                + "\nLocation: " + location + "."
                + "\nKey persons: " + keyPersons + "."
                + "\nThe industry in which the organization is involved: " + industry + "."
                + "\nWho founded: " + theFounder + "."
                + "\nYear of foundation: " + foundationYear + "."
                + "\nQuantity of involved people: <" + numberOfEmployees + ">."
                + "\nShort description: " + shortDescription + ".";
    }
}
