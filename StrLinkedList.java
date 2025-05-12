public class StrLinkedList {
    private Node head;  // The starting point of the list
    // Node class to represent each element in the list


    //Define an inner class called Node for nodes in your StrLinkedList. It
    //should have the following:
    private class Node {
        //a member variable called "value" to hold the String value
        String value;   // This will hold the string data
        //a member variable called "next" to hold a link to another Node.
        Node next;      // This will reference the next node in the list

        //Constructor for the Node class
        //constructor that takes a String argument and copies that value into the node's
        //"value" member variable.
        public Node(String value) {
            this.value = value;
            this.next = null;
        }
    }

    // Constructor for the linked list
    public StrLinkedList() {
        head = null;  // Initially, the list is empty
    }

    //isEmpty() - returns boolean true if the linked list is empty.
    // Check if the list is empty
    public boolean isEmpty() {
        return head == null;  // If head is null, the list is empty
    }



    // Get the length of the list (number of nodes)
    public int getLength() {
        int length = 0;
        Node current = head;

        while (current != null) {
            length++;
            current = current.next;  // Move to the next node
        }
        return length;
    }

    //hasValue(String s) - returns a boolean value that is true if the linked list
    //contains a node whose value is the same as s; false otherwise.
    // Check if the list contains a specific value
    public boolean hasValue(String s) {
        Node current = head;
        while (current != null) {
            if (current.value.equals(s)) {
                return true;  // Return true if the value is found
            }
            current = current.next;  // Move to the next node
        }

        return false;  // Return false if the value is not found
    }

    // Get the value at a specific index in the list
    public String getValueAt(int i) {
        if (i < 0 || i >= getLength()) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        Node current = head;
        for (int j = 0; j < i; j++) {
            current = current.next;  // Traverse the list to the index
        }

        return current.value;  // Return the value at the index
    }

    // Add a new node with the value at the head of the list
    public void add(String s) {
        Node newNode = new Node(s);  // Create a new node
        newNode.next = head;         // Point the new node to the current head
        head = newNode;              // Make the new node the head of the list
    }

    // Remove the first node that contains a specific value
    public void remove(String s) {
        if (head == null) return;  // If the list is empty, do nothing

        if (head.value.equals(s)) {  // If the head is the node to be removed
            head = head.next;  // Remove the head node by making head point to the next node
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.value.equals(s)) {
                current.next = current.next.next;  // Remove the node by skipping it
                return;
            }
            current = current.next;  // Move to the next node
        }
    }

    // Print the values in the list
    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value);
            if (current.next != null) {
                System.out.print("->");  // Print "->" between values
            }
            current = current.next;  // Move to the next node
        }
        System.out.println();  // Move to the next line after printing the list
    }
}