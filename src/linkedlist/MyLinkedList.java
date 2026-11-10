package src.linkedlist;

public class MyLinkedList {
    Node head;

    // 1. Add node to the end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // 2. Print a specific node by position (1-based)
    public void printNodeAt(int position) {
        Node temp = head;
        int count = 1;
        while (temp != null) {
            if (count == position) {
                System.out.println("Node at position " + position + " is: " + temp.data);
                return;
            }
            temp = temp.next;
            count++;
        }
        System.out.println("Position " + position + " is out of bounds.");
    }

    // 3. Delete a node by value
    public void delete(int key) {
        Node temp = head, prev = null;

        if (temp != null && temp.data == key) {
            head = temp.next; // Head changed
            return;
        }

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) return; // Key not found

        prev.next = temp.next; // Unlink node
    }

    // 4. Display the whole list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
	
	public boolean equals(MyLinkedList other) {
    Node temp1 = this.head;
    Node temp2 = other.head;

    while (temp1 != null && temp2 != null) {
        if (temp1.data != temp2.data) {
            return false;
        }
        temp1 = temp1.next;
        temp2 = temp2.next;
    }

    // If both reached null, lists are equal
    return temp1 == null && temp2 == null;
}

    // Main method to test the functions
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        System.out.print("Current List: ");
        list.display();

        list.printNodeAt(4); // Testing your original request

        list.delete(30);
        System.out.print("After deleting 30: ");
        list.display();
    }
}