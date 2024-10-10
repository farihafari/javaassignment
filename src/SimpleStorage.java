// Class implementing the Storage interface
public class SimpleStorage<T> implements Storage<T> {
    private T item; // Field to store a single item

    @Override
    public void addItem(T item) {
        this.item = item; // Store the item
    }

    @Override
    public T getItem() {
        return item; // Return the stored item
    }
}
