import java.time.LocalDate;
import java.util.*;

public class Test {

    public static void main(String[] args) {

        Customer joe = new Customer("Average Joe", LocalDate.now().minusYears(45));
        Customer cat = new Customer("Chatty Cathy", LocalDate.now().minusYears(25));
        Customer deb = new Customer("Debbie Downer", LocalDate.now().minusYears(37));
        Customer sue = new Customer("Gloomy Gus", LocalDate.now().minusYears(58));
        Customer sim = new Customer("Simple Simon", LocalDate.now().minusYears(19));

        List<Customer> market = new ArrayList<>();
        market.add(joe);
        market.add(cat);
        market.add(deb);
        market.add(sue);
        market.add(sim);
        Collections.sort(market);
        System.out.println("Sorted Customers: " + market);

        List customers = List.of(joe, cat);
        int result = joe.compareTo(cat);

        if (result == 0) {
            System.out.println("The Objects 'joe' and 'cat' are equal.");
        } else if (result < 0) {
            System.out.println("The Objects 'joe' is smaller than 'cat'.");
        } else {
            System.out.println("The Objects 'joe' is bigger than 'cat'.");
        }

        Comparator<Customer> byName = Comparator.comparing(Customer::getName);
        Comparator<Customer> byBirthdate = Comparator.comparing(Customer::getBirthDate);

        int result2 = byName.compare(joe, cat);
        int result3 = byBirthdate.compare(joe, cat);
        System.out.println("Comparing by name: " + result2); // Affichera le résultat de la comparaison
        System.out.println("Comparing by birthdate: " + result3); // Affichera le résultat de la comparaison

        // Trier par nom
        Collections.sort(market, Comparator.comparing(Customer::getName));
        System.out.println("Customers sorted by name: " + market);

        market.sort(byBirthdate);
        System.out.println("Customers sorted by birthDate: " + market);

    }
}
