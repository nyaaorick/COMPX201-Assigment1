
// This is a test class for the StrLinkedList class
// It contains a main method to test the functionality of the linked list
public class test {
    public static void main(String[] args) {
        // Create a new linked list
        StrLinkedList list = new StrLinkedList();

        // Test isEmpty() - should be true as the list is initially empty
        System.out.println("Is the list empty? " + list.isEmpty());

        // Add some values to the list
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.print("List after adding values: ");
        list.print();  // Expected: C->B->A->

        // Test getLength() - should return 3
        System.out.println("Length of the list: " + list.getLength());  // Expected: 3

        // Test hasValue() - check if "B" exists in the list
        System.out.println("Does the list contain 'B'? " + list.hasValue("B"));  // Expected: true

        // Test getValueAt() - get value at index 1
        System.out.println("Value at index 1: " + list.getValueAt(1));  // Expected: B

        // Test remove() - remove the node with value "B"
        list.remove("B");
        System.out.print("List after removing 'B': ");
        list.print();  // Expected: C->A->

        // Test remove() on a non-existent value (it shouldn't change the list)
        list.remove("X");
        System.out.print("List after trying to remove 'X': ");
        list.print();  // Expected: C->A->

        // Test isEmpty() after removing all elements
        list.remove("C");
        list.remove("A");
        System.out.println("Is the list empty after removals? " + list.isEmpty());  // Expected: true
    }
}
