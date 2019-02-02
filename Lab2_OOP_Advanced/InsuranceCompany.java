package CPP.Lab2_OOP_Advanced;
import java.util.ArrayList;

/*
Heir class,
This class will describe elements specific
to a particular type of organization(Insurance company).
 */

public class InsuranceCompany extends Organization{
    private ArrayList<InsuranceCompany> insurers = new ArrayList<>();
    private int clientsQuantity;
    private int officesQuantity;
    private int equity; // собственный капитал
    private int turnover; // оборот
    private int netProfit; // чистая прибыль
    private int actives; // активы
    private int capitalization; // капитализация

    // constructor for default organization without any parameters
    public InsuranceCompany()
    {
        super.setName("Berkshire Hathaway");
        super.setTheFounder("Oliver Chace");
        super.setIndustry("insurance, finance, rail transport, utilities, food and non-food products");
        super.setFoundationYear("1839");
        super.setShortDescription("The company is known for its control and leadership by Warren Buffett," +
                "\nwho serves as chairman and chief executive, and Charlie Munger, the company's vice chairman.");
        super.setNumberOfEmployees("377000");
        super.setLocation("Kiewit Plaza, Omaha, Nebraska, U.S.");
        super.setKeyPersons("Warren E. Buffett(CEO), Charles T. Munger(Vice Chairman), Ajit Jain(Vice Chairman)");
        clientsQuantity = 2444444;
        officesQuantity = 76;
        equity = 350;
        turnover = 242;
        netProfit = 45;
        actives = 702;
        capitalization = 512;
    }
    // constructor for being created organization with with specified parameters
    public InsuranceCompany(String name, String industry, String theFounder, String foundationYear,
                            String shortDescription, String numberOfEmployees, String location, String keyPersons,
                            int clientsQuantity, int officesQuantity,
                            int equity, int turnover, int netProfit, int actives, int capitalization) {
        super(name, industry, theFounder, foundationYear, shortDescription, numberOfEmployees, location, keyPersons);
        this.clientsQuantity = clientsQuantity;
        this.officesQuantity = officesQuantity;
        this.equity = equity;
        this.turnover = turnover;
        this.netProfit = netProfit;
        this.actives = actives;
        this.capitalization = capitalization;
    }

    @Override
    public void createOrganization() {
        super.createOrganization(); // parent part
        System.out.println("9.Quantity of clients: "); // heir part
        clientsQuantity = console.nextInt();
        System.out.println("10.Quantity of offices: ");
        officesQuantity = console.nextInt();
        System.out.println("11.Equity of company: ");
        equity = console.nextInt();
        System.out.println("12.Turnover of company: ");
        turnover = console.nextInt();
        System.out.println("13.Net profit of company: ");
        netProfit = console.nextInt();
        System.out.println("14.Actives of company: ");
        actives = console.nextInt();
        System.out.println("15.Capitalization of company: ");
        capitalization = console.nextInt();
        insurers.add(new InsuranceCompany(getName(),getIndustry(),getTheFounder(),getFoundationYear(),
                getShortDescription(),getNumberOfEmployees(),getLocation(),getKeyPersons(),
                clientsQuantity,officesQuantity,equity,turnover,netProfit,actives,capitalization));
    }

    // outputs the number of created organizations
    @Override
    public int numberOfExistingElements(){
        return insurers.size();
    }

    @Override
    public void createDefault() {
        insurers.add(new InsuranceCompany());
    }

    @Override
    public void displayInformation() {
        for (InsuranceCompany i : insurers) { System.out.println(i);}
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n9.Quantity of clients: " + clientsQuantity + " ppl." +
                "\n10.Quantity of offices: " + officesQuantity + " units." +
                "\n11.Equity: US$" + equity + " billion." +
                "\n12.Turnover: US$" + turnover + " billion." +
                "\n13.Net Profit: US$" + netProfit + " billion." +
                "\n14.Actives: US$" + actives + " billion." +
                "\n15.Capitalization: US$" + capitalization + " billion.";
    }
}
