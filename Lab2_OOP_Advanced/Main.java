package CPP.Lab2_OOP_Advanced;
import java.util.*;

/*
Variant 5.
Core OOP principles
following classes was used to describe types of different organizations:
Organization, Factory, Insurance Company, Oil - Gas Company.
 */

public class Main {
    private static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        Menu manage = new Menu();
        manage.manager(console);
    }
}
