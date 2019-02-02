package CPP.Lab2_OOP;

/*
Heir class,
This class will describe elements specific
to a particular type of organization(Oil and Gas company).
 */

public class OilGasCompany extends Organization{
    private int equity; // собственный капитал
    private int turnover; // оборот
    private int netProfit; // чистая прибыль
    private int actives; // активы
    private int capitalization; // капитализация

    public OilGasCompany(String name, String industry, String theFounder, int foundationYear, String shortDescription, int numberOfEmployees, String location, String keyPersons, int equity, int turnover, int netProfit, int actives, int capitalization) {
        super(name, industry, theFounder, foundationYear, shortDescription, numberOfEmployees, location, keyPersons);
        this.equity = equity;
        this.turnover = turnover;
        this.netProfit = netProfit;
        this.actives = actives;
        this.capitalization = capitalization;
    }

    // override method of class Object - toString()
    @Override
    public String toString() {
        return super.toString() +
                "\nEquity: US$" + equity + " billion." +
                "\nTurnover: US$" + turnover + " billion." +
                "\nNet Profit: US$" + netProfit + " billion." +
                "\nActives: US$" + actives + " billion." +
                "\nCapitalization: US$" + capitalization + " billion.";
    }
}
