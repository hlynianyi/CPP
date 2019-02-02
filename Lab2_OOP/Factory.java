package CPP.Lab2_OOP;

/*
Heir class,
This class will describe elements specific
to a particular type of organization(Factory).
 */

public class Factory extends Organization{
    private int netProfit;
    private String production;

    public Factory(String name, String industry, String theFounder, int foundationYear, String shortDescription,
                   int numberOfEmployees, String location, int netProfit, String production, String keyPersons) {
        super(name, industry, theFounder, foundationYear, shortDescription, numberOfEmployees, location, keyPersons);
        this.netProfit = netProfit;
        this.production = production;
    }

    // override method of class Object - toString()
    @Override
    public String toString() {
        return super.toString()
                + "\nNet profit/loss: " + netProfit + " hrivnas."
                + "\nProduction type: " + production + ".";
    }
}
