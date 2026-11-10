package src.linkedlist;

public class Main2 {
    public static void main(String[] args) {
        DLL dll=new DLL();
        dll.InsertFirst(23);
        dll.InsertFirst(212);
        dll.InsertFirst(2);
        dll.InsertFirst(43);
        dll.InsertFirst(35);
        dll.InsertFirst(12);
        dll.InsertFirst(56);

        
        dll.InsertLast(345);
   
        
        dll.insert(43, 123);
        dll.Display();
    }
}
