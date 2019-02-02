package CPP.Lab2_OOP;
import java.util.*;

/*
Variant 5.
Core OOP principles
following classes was used to describe types of different organizations:
Organization, Factory, Insurance Company, Oil - Gas Company.
 */

public class Main {
    // Object ArrayList was created to store all organizations objects
    static ArrayList<Organization> organizations = new ArrayList<Organization>();
    static Organization[] organs = new Organization[6];

    public static void main(String[] args) {
        // creating different objects of organization and child-classes
        organs[0] = new Organization("Human Rights Watch", "None commercial social organization",
                "Robert Bjornstain, Aryeh Neier", 1978,
                "This is an international non-governmental organization, headquartered in New York City, " +
                        "\nthat conducts research and advocacy on human rights.[1] The group pressures some governments, " +
                        "\npolicy makers and human rights abusers to denounce abuse and respect human rights, and the group " +
                        "\noften works on behalf of refugees, children, migrants and political prisoners.",
                400, "None", "Kenneth Rhoth(director)");
        organs[1] = new Organization("Wikimedia Foundation", "None commercial social organization",
                "Jimmy Wales", 2003,
                "This is an American non-profit and charitable organization headquartered in San Francisco, California. " +
                        "\nIt is mostly known for participating in the Wikimedia movement. It owns the internet domain names of most movement " +
                        "\nprojects and hosts sites like Wikipedia. The foundation was founded in 2003 by Jimmy Wales as a way to fund Wikipedia " +
                        "\nand its sibling projects through non-profit means.", 350000, "None",
                "Maria Sefidari(chair on the board), Katherine Maher(Executive director)");
        organs[2] = new Factory("Kharkiv Tractor Plant", "engineering", "Former Soviet Union", 1931,
                "Soviet name (named after Sergo Ordzhonikidze), and then the Ukrainian company for the production of " +
                        "tracked and wheeled tractors",2190,"Ukraine, city Kharkiv", -667000000,
                "tractors, attachments", "Koval Andrew Anatoljevich");
        organs[3] = new InsuranceCompany("Berkshire Hathaway", "insurance, finance, rail transport, utilities, " +
                "food and non-food products","Oliver Chace",1839, "The company is known for its " +
                "control and leadership by Warren Buffett, who serves as chairman and chief executive, and Charlie Munger, " +
                "\nthe company's vice chairman. In the early part of his career at Berkshire, Buffett focused on long-term " +
                "investments in publicly traded companies, but more recently he has" +
                "\nmore frequently bought whole companies.", 377000, "Kiewit Plaza, Omaha, Nebraska, U.S.",
                "Warren E. Buffett(CEO), Charles T. Munger(Vice Chairman), Ajit Jain(Vice Chairman)",
                350, 242, 45, 702, 512);
        organs[4] = new OilGasCompany("British Petroleum","Extraction and processing of oil and gas",
                "William Knox D’Arcy", 1909,"BP is is a British multinational oil and" +
                " gas company headquartered in London, England. It is one of the world's seven oil and gas <supermajors>, " +
                "\nwhose performance in 2012 made it the world's sixth-largest oil and gas company, the sixth-largest " +
                "energy company by market capitalization and " +
                "\nthe company with the world's 12th-largest revenue (turnover).", 74000,
                "London, England", "Helge Lund(Chairman), Bob Dudley(Group Chief Executive), " +
                "Lamar McKay(Deputy Group Chief Executive)",244, 10, 4, 100,213);
        organs[5] = new Organization();

        printArrayData(); // output all the data that stored in Organization[] array
    }

    static void dataPrinter(){ // Method that output data
        System.out.println("Here are list of presented organizations:");
        for(Organization org : organizations) {
            System.out.println(org);
        }
    }

    static void printArrayData(){
        System.out.println("The following data about all organizations stored in array:");
        for(Organization orgs : organs) {
            System.out.println(orgs);
        }
    }
}
