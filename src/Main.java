import java.util.List; // Import List interface
import java.util.Arrays; // Import Arrays class for printing
// If Printer is in a package named 'utilities'
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
                new Doctor("Alice", 1, 80000, "Cardiology"),
                new Nurse("Bob", 2, 50000, 12),
                new Receptionist("Charlie", 3, 40000, 1),
                new Surgeon("David", 4, 120000, "Neurology", 50)
        };

        Hospital hospital = new Hospital();

        for (Employee emp : employees) {
            hospital.manageEmployee(emp);
            hospital.paySalary(emp);
        }




    }
}
 class PaymentTest {
    public static void main(String[] args) {
        Payment payment = new Payment();

        // Testing different payment scenarios
        payment.processPayment(100); // Cash payment
        payment.processPayment("1234-5678-9876-5432", 250); // Credit card payment
        payment.processPayment("00112233", "Bank of America", 300); // Check payment
        payment.processPayment(922345678900L, 50); // Mobile payment (note the long type)


    }
}

 class BoxTest {
    public static void main(String[] args) {
        // Creating a Box for Integer
        Box<Integer> intBox = new Box<>(42);
        System.out.println("Box contains: " + intBox.getItem());

        // Creating a Box for String
        Box<String> strBox = new Box<>("Hello, World");
        System.out.println("Box contains: " + strBox.getItem());

        // Creating a Box for Double
        Box<Double> doubleBox = new Box<>(15.75);
        System.out.println("Box contains: " + doubleBox.getItem());
    }
}

 class PrinterTest {
    public static void main(String[] args) {
        Printer printer = new Printer();

        // List of Integers
        List<Integer> intList = List.of(1, 2, 3, 4, 5);
        printer.printItems(intList); // Output: 1, 2, 3, 4, 5

        // List of Strings
        List<String> strList = List.of("Apple", "Orange", "Banana");
        printer.printItems(strList); // Output: Apple, Orange, Banana
    }
}


 class PairTest {
    public static void main(String[] args) {
        // Create a Pair with Integer as key and String as value
        Pair<Integer, String> pair1 = new Pair<>(1, "Apple");
        System.out.println("Key: " + pair1.getKey() + ", Value: " + pair1.getValue());

        // Create a Pair with String as key and Double as value
        Pair<String, Double> pair2 = new Pair<>("Name", 75.5);
        System.out.println("Key: " + pair2.getKey() + ", Value: " + pair2.getValue());
    }
}
class ArrayUtilsTest {
    public static void main(String[] args) {
        // Demonstrate swapping with Integer array
        Integer[] intArray = {1, 2, 3, 4};
        System.out.println("Before swap: " + Arrays.toString(intArray));
        ArrayUtils.swap(intArray, 1, 3); // Swap elements at indices 1 and 3
        System.out.println("After swap: " + Arrays.toString(intArray));

        // Demonstrate swapping with String array
        String[] strArray = {"Hello", "World", "Java"};
        System.out.println("Before swap: " + Arrays.toString(strArray));
        ArrayUtils.swap(strArray, 0, 2); // Swap elements at indices 0 and 2
        System.out.println("After swap: " + Arrays.toString(strArray));
    }
}
// Class to test the SimpleStorage functionality
 class StorageTest {
    public static void main(String[] args) {
        // Create a SimpleStorage for String
        SimpleStorage<String> stringStorage = new SimpleStorage<>();
        stringStorage.addItem("Hello, World!");
        System.out.println("Stored String: " + stringStorage.getItem()); // Output: Hello, World!

        // Create a SimpleStorage for Integer
        SimpleStorage<Integer> integerStorage = new SimpleStorage<>();
        integerStorage.addItem(42);
        System.out.println("Stored Integer: " + integerStorage.getItem()); // Output: 42

        // Create a SimpleStorage for Float
        SimpleStorage<Float> floatStorage = new SimpleStorage<>();
        floatStorage.addItem(3.14f);
        System.out.println("Stored Float: " + floatStorage.getItem()); // Output: 3.14
    }
}

