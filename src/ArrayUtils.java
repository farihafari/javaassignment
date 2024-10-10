public class ArrayUtils {
    // Generic method to swap elements in an array
    public static <T> void swap(T[] array, int i, int j) {
        // Check if indices are within bounds
        if (i < 0 || i >= array.length || j < 0 || j >= array.length) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        T temp = array[i];  // Store the element at index i
        array[i] = array[j]; // Set the element at index i to the element at index j
        array[j] = temp;     // Set the element at index j to the stored element
    }
}
