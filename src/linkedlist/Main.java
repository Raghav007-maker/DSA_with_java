package src.linkedlist;

public class Main {
    public static void main(String[] args) {
        LL one=new LL();
        one.FirstInput(23);
        one.FirstInput(212);
        one.FirstInput(2);
        one.FirstInput(43);
        one.FirstInput(35);
        one.FirstInput(12);
        one.FirstInput(56);

        one.Display();
        
        one.insert(100,3);
        
        one.Display();
        
        one.deleteFirst();
        
        one.Display();

        one.deleteLast();

        one.Display();
        
        one.delete(3);
        one.Display();

        System.out.println(one.find(100));
    }
}
