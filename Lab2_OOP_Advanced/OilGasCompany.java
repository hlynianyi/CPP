package CPP.Lab2_OOP_Advanced;
import java.util.ArrayList;

/*
Heir class,
This class will describe elements specific
to a particular type of organization(Oil and Gas company).
 */

public class OilGasCompany extends Organization{
    private ArrayList<OilGasCompany> oilers = new ArrayList<>();
    private int equity; // собственный капитал
    private int turnover; // оборот
    private int netProfit; // чистая прибыль
    private int actives; // активы
    private int capitalization; // капитализация
    private double developedReserves; // количество разрабатываемых месторождений
    private double averageSalary; // средняя зарплата

    // constructor for default organization without any parameters
    public OilGasCompany()
    {
        super.setName("British Petroleum");
        super.setTheFounder("William Knox D’Arcy");
        super.setIndustry("Extraction and processing of oil and gas");
        super.setFoundationYear("1909");
        super.setShortDescription("BP is is a British multinational oil and gas company headquartered in London, England." +
                "\nIt is one of the world's seven oil and gas 'supermajors', whose performance in 2012 made it the world's " +
                "\nsixth-largest oil and gas company, the sixth-largest energy company by market capitalization and" +
                "\nthe company with the world's 12th-largest revenue (turnover).");
        super.setNumberOfEmployees("74000");
        super.setLocation("London, England");
        super.setKeyPersons("Helge Lund(Chairman), Bob Dudley(Group Chief Executive)");
        equity = 244;
        turnover = 10;
        netProfit = 4;
        actives = 100;
        capitalization = 213;
        developedReserves = 39;
        averageSalary = 2130;
    }
    // constructor for being created organization with with specified parameters
    public OilGasCompany(String name, String industry, String theFounder, String foundationYear, String shortDescription,
                         String numberOfEmployees, String location, String keyPersons,
                         int equity, int turnover, int netProfit, int actives, int capitalization,
                         double developedReserves, double averageSalary) {
        super(name, industry, theFounder, foundationYear, shortDescription, numberOfEmployees, location, keyPersons);
        this.equity = equity;
        this.turnover = turnover;
        this.netProfit = netProfit;
        this.actives = actives;
        this.capitalization = capitalization;
        this.developedReserves = developedReserves;
        this.averageSalary = averageSalary;
    }

    @Override
    public void createOrganization() {
        super.createOrganization();
        System.out.println("9.Average salary in company: "); // heir part
        averageSalary = console.nextInt();
        System.out.println("10.Quantity of developed reserves: ");
        developedReserves = console.nextInt();
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
        oilers.add(new OilGasCompany(getName(),getIndustry(),getTheFounder(),getFoundationYear(),
                getShortDescription(),getNumberOfEmployees(),getLocation(),getKeyPersons(),equity,turnover,
                netProfit,actives,capitalization,developedReserves,averageSalary));
    }

    // outputs the number of created organizations
    @Override
    public int numberOfExistingElements(){
        return oilers.size();
    }

    @Override
    public void createDefault() {
        oilers.add(new OilGasCompany());
    }

    @Override
    public void displayInformation() {
        for (OilGasCompany og : oilers) { System.out.println(og);}
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n9.Equity: US$" + equity + " billion." +
                "\n10.Turnover: US$" + turnover + " billion." +
                "\n11.Net Profit: US$" + netProfit + " billion." +
                "\n12.Actives: US$" + actives + " billion." +
                "\n13.Capitalization: US$" + capitalization + " billion." +
                "\n14.Number of developed oil reserves: " + developedReserves + " billion barrels." +
                "\n15.Average salary of employees " + averageSalary + "$.";
    }
}
