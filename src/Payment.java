class Payment {
    // Cash payment
    public void processPayment(double amount) {
        System.out.println("Processing cash payment of $" + amount);
    }

    // Credit card payment
    public void processPayment(String cardNumber, double amount) {
        System.out.println("Processing credit card payment of $" + amount + " using card: " + cardNumber);
    }

    // Check payment
    public void processPayment(String checkNumber, String bankName, double amount) {
        System.out.println("Processing check payment of $" + amount + " from " + bankName + " with check number: " + checkNumber);
    }

    // Mobile payment
    public void processPayment(long mobileNumber, double amount) {
        System.out.println("Processing mobile payment of $" + amount + " using mobile number: " + mobileNumber);
    }
}

// Generic class Box that can hold any type of object
class Box<T> {
    // Private field to store the item
    private T item;

    // Constructor to store the item
    public Box(T item) {
        this.item = item;
    }

    // Method to return the stored item
    public T getItem() {
        return item;
    }

    // Method to change the item in the box
    public void setItem(T item) {
        this.item = item;
    }
}
// Generic class Calculator with bounded type parameter T that extends Number
class Calculator<T extends Number> {

    // Method to add two numbers of type T
    public double sum(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }
}
 class CalculatorTest {
    public static void main(String[] args) {
        // Demonstrating the Calculator with Integer
        Calculator<Integer> intCalculator = new Calculator<>();
        System.out.println("Sum of Integers: " + intCalculator.sum(10, 20));

        // Demonstrating the Calculator with Double
        Calculator<Double> doubleCalculator = new Calculator<>();
        System.out.println("Sum of Doubles: " + doubleCalculator.sum(15.5, 20.25));
    }
}