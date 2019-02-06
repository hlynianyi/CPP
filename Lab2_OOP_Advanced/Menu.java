package CPP.Lab2_OOP_Advanced;

import java.util.Scanner;

public class Menu {
    // objects that are needed to call class methods
    private Organization org = new Organization();
    private Factory factory = new Factory();
    private OilGasCompany oilgas = new OilGasCompany();
    private InsuranceCompany insurance = new InsuranceCompany();

    void manager(Scanner console) {
        boolean wantToContinue = true;
        while (wantToContinue) {
            menuList();
            if (console.hasNextInt()) { // checking for Int variable
                int selector = console.nextInt(); // variable that takes numeric to choose task
                switch (selector) {
                    case 1:
                        whichTypeOfOrganizationCreate(console); // Select which organization you want to create
                        break;
                    case 2:
                        whichTypeOfOrganizationShow(console); // Select which organization you want to show
                        break;
                    case 3:
                        System.out.println("Program was closed.");
                        return;
                    default:
                        System.out.println("This variant is not exist, yet..");
                }
            } else {
                System.out.println("Unpredictable number or type..");
            }
        }
    }

    // switch-case method that ask user which one organization need to create
    private void whichTypeOfOrganizationCreate(Scanner console) {
        asksWhatToCreate();
        if (console.hasNextInt()) {
            int selector = console.nextInt();
            switch (selector) {
                case 1:
                    org.createOrganization();
                    break;
                case 2:
                    factory.createOrganization();
                    break;
                case 3:
                    oilgas.createOrganization();
                    break;
                case 4:
                    insurance.createOrganization();
                    break;
                case 5:
                    org.createDefault();
                    factory.createDefault();
                    insurance.createDefault();
                    oilgas.createDefault();
                    System.out.println("Four different default types of organization was created.");
                    break;
                case 6:
                    return;
            }
        }
    }

    // switch-case method that ask user which one organization need to display
    private void whichTypeOfOrganizationShow(Scanner console) {
        asksWhatToShow();
        if (console.hasNextInt()) {
            int selector = console.nextInt();
            switch (selector) {
                case 1:
                    org.displayInformation();
                    break;
                case 2:
                    factory.displayInformation();
                    break;
                case 3:
                    oilgas.displayInformation();
                    break;
                case 4:
                    insurance.displayInformation();
                    break;
                case 5:
                    org.displayInformation();
                    factory.displayInformation();
                    insurance.displayInformation();
                    oilgas.displayInformation();
                case 6:
                    return;
            }
        }
    }

    // output information about possibilities of program
    private void menuList() {
        String StringContent = "\033[0;1m" + "\n-------------------------------------------------------" +
                "\nSelect from the presented options: \n " +
                "1: Create an organization.\n " +
                "2: List of organizations.\n " +
                "3: Close the program.\n" +
                "-------------------------------------------------------";
        System.out.println(StringContent);
    }

    private void asksWhatToCreate() {
        System.out.println("-------------------------------------------------------\n" +
                "Select what type of organization you want to create: \n" +
                "1: Create default organization. \n" +
                "2: Create factory. \n" +
                "3: Create Oil and Gas company. \n" +
                "4: Create Insurance company. \n" +
                "5: Create each class one at a time default(do it once). \n" +
                "6: Back to menu.\n" +
                "-------------------------------------------------------");
    }

    private void asksWhatToShow() {
        System.out.println("Select what type of organization you want to display: " +
                "\n1: Display organizations list{" + org.numberOfExistingElements() + "}." +
                "\n2: Display factories list{" + factory.numberOfExistingElements() + "}." +
                "\n3: Display Oil and Gas companies list{" + insurance.numberOfExistingElements() + "}." +
                "\n4: Display Insurance companies list{" + oilgas.numberOfExistingElements() + "}." +
                "\n5. Display all that stored list{" + (org.numberOfExistingElements() +
                factory.numberOfExistingElements() + insurance.numberOfExistingElements()
                + oilgas.numberOfExistingElements()) + "}." +
                "\n6: Back to menu." +
                "\n-------------------------------------------------------");
    }
}
