package CPP.Lab2_OOP_Advanced;
import java.util.ArrayList;

/*
Heir class,
This class will describe elements specific
to a particular type of organization(Factory).
 */

public class Factory extends Organization{
    private ArrayList<Factory> factories = new ArrayList<>();
    private String netProfit;
    private String production;

    // constructor for default organization without any parameters
    public Factory()
    {
        super.setName("Kharkiv Tractor Plant");
        super.setIndustry("Engineering");
        super.setTheFounder("Former Soviet Union");
        super.setFoundationYear("1931");
        super.setShortDescription("Soviet name (named after Sergo Ordzhonikidze), and then the Ukrainian company for the production of" +
                "\ntracked and wheeled tractors");
        super.setNumberOfEmployees("2190");
        super.setLocation("Kharkiv, Ukraine");
        super.setKeyPersons("Koval Andrew Anatoljevich");
        netProfit = "-667.000.000";
        production = "tractors, attachments";
    }
    // constructor for being created organization with with specified parameters
    public Factory(String name, String industry, String theFounder, String foundationYear, String shortDescription,
                   String numberOfEmployees, String location, String keyPersons, String production, String netProfit) {
        super(name,industry,theFounder,foundationYear,shortDescription,numberOfEmployees,location,keyPersons);
        this.production = production;
        this.netProfit = netProfit;
    }

    @Override
    public void createOrganization() {
        super.createOrganization(); // parent part input
        System.out.println("9.Production list: "); // heir part input
        production = console.nextLine();
        System.out.println("10.NetProfit is: ");
        netProfit = console.nextLine();
        factories.add(new Factory(getName(),getIndustry(),getTheFounder(),getFoundationYear(),
                getShortDescription(),getNumberOfEmployees(),getLocation(),getKeyPersons(),production,netProfit));
    }

    // outputs the number of created organizations
    @Override
    public int numberOfExistingElements(){
        return factories.size();
    }

    @Override
    public void createDefault() {
        factories.add(new Factory());
    }

    @Override
    public void displayInformation() {
        for (Factory f : factories) { System.out.println(f);}
    }

    @Override
    public String toString() {
        return super.toString()
                + "\n9.Production type: " + production + "."
                + "\n10.Net profit/loss: " +netProfit + " hrivnas.";
    }
}
