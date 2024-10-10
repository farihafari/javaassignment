import java.util.List;

// Printer class with a generic method using wildcard
public class Printer {
    // Method to print each element in the list
    public void printItems(List<?> items) {
        System.out.print("Items: ");
        for (int i = 0; i < items.size(); i++) {
            System.out.print(items.get(i));
            if (i < items.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(); // Print new line after the list
    }
}
