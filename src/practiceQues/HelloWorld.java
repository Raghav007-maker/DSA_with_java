package src.practiceQues;

import src.linkedlist.MyLinkedList;
import src.linkedlist.Node;

    public class HelloWorld{
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
	MyLinkedList dl = new MyLinkedList();

	dl.insert(10);
        dl.insert(20);
        dl.insert(30);
        dl.insert(40);
        dl.insert(50);
	System.out.println(list.equals(dl));
       
    }
}

