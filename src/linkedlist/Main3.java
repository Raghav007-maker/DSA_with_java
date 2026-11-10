
package src.linkedlist;

public class Main3 {
    public static void main(String[] args) {
        circular node=new circular();
        node.InsertLast(23);
        node.InsertLast(46);
        node.InsertLast(13);
        node.InsertLast(65);
        node.InsertLast(12);

        node.display();

        node.delete(13);
        node.display();

    }
}
