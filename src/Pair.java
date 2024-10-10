// Generic Pair class
public class Pair<K, V> {
    private final K key; // Key of type K
    private final V value; // Value of type V

    // Constructor to initialize key and value
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    // Method to get the key
    public K getKey() {
        return key;
    }

    // Method to get the value
    public V getValue() {
        return value;
    }
}