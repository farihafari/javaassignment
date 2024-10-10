// Generic interface Storage
public interface Storage<T> {
    void addItem(T item); // Method to add an item
    T getItem();          // Method to retrieve the item
}
