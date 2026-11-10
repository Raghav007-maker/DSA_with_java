package src.practiceQues;

import src.linkedlist.MyLinkedList; 


public class testLL {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.insert(10);
        list.insert(20);

        System.out.print("Current List: ");
        list.display();
    }
}
