package CPP.Lab2_OOP_Advanced;

import java.util.ArrayList;
import java.util.Scanner;

public class Organization implements Operations {
    private static ArrayList<Organization> organizations = new ArrayList<>();
    Scanner console = new Scanner(System.in);
    private String name;
    private String industry;
    private String theFounder;
    private String foundationYear;
    private String shortDescription;
    private String numberOfEmployees;
    private String location;
    private String keyPersons;

    // constructor for default organization without any parameters
    public Organization() {
        name = "Human Rights Watch";
        industry = "None-commercial social organization";
        theFounder = "Robert Bjornstain, Aryeh Neier";
        foundationYear = "1978";
        shortDescription = "This is an international non-governmental organization, headquartered in New York City" +
                "\nthat conducts research and advocacy on human rights.";
        numberOfEmployees = "400";
        location = "Planet Earth";
        keyPersons = "Kenneth Rhoth[director]";
    }

    // constructor for being created organization with with specified parameters
    public Organization(String name, String industry, String theFounder,
                        String foundationYear, String shortDescription, String numberOfEmployees, String location, String keyPersons) {
        this.name = name;
        this.industry = industry;
        this.theFounder = theFounder;
        this.foundationYear = foundationYear;
        this.shortDescription = shortDescription;
        this.numberOfEmployees = numberOfEmployees;
        this.location = location;
        this.keyPersons = keyPersons;
    }

    @Override
    public void createOrganization() {
        System.out.println("1.Name:");
        name = console.nextLine();
        System.out.println("2.Industry:");
        industry = console.nextLine();
        System.out.println("3.The Founder:");
        theFounder = console.nextLine();
        System.out.println("4.Location:");
        location = console.nextLine();
        System.out.println("5.Key Persons:");
        keyPersons = console.nextLine();
        System.out.println("6.Foundation year:");
        foundationYear = console.nextLine();
        System.out.println("7.How much people involved:");
        numberOfEmployees = console.nextLine();
        System.out.println("8.Write description about organization:");
        shortDescription = console.nextLine();
        organizations.add(new Organization(name, industry, theFounder, foundationYear,
                shortDescription, numberOfEmployees, location, keyPersons));
    }

    // outputs the number of created organizations
    @Override
    public int numberOfExistingElements() {
        return organizations.size();
    }


    public void createDefault() {
        organizations.add(new Organization());
    }

    @Override
    public void displayInformation() {
        for (Organization o : organizations) {
            System.out.println(o);
        }
    }

    @Override
    public String toString() {
        return "-------------------------------------------------------" +
                "\nThe object belongs to the " + getClass().getSimpleName() + " class"
                + "\n1.Name: " + name + "."
                + "\n2.The industry: " + industry + "."
                + "\n3.Location: " + location + "."
                + "\n4.Year of foundation: " + foundationYear + "."
                + "\n5.Who founded: " + theFounder + "."
                + "\n6.Key persons: " + keyPersons + "."
                + "\n7.Quantity of involved people: " + numberOfEmployees + "."
                + "\n8.Short description: " + shortDescription + ".";
    }

    //getters-setters part
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getTheFounder() {
        return theFounder;
    }

    public void setTheFounder(String theFounder) {
        this.theFounder = theFounder;
    }

    public String getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(String foundationYear) {
        this.foundationYear = foundationYear;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(String numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getKeyPersons() {
        return keyPersons;
    }

    public void setKeyPersons(String keyPersons) {
        this.keyPersons = keyPersons;
    }
}
