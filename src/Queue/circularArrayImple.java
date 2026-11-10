package Queue;

class circularQueue{

    private int[] arr;
    private int r;
    private int f;
    private int size;

    public void display(){
        if(size == 0) return;
        if(f >= r){
            for(int i = f; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }

            for(int i = 0; i < r; i++){
                System.out.print(arr[i] + " ");
            }
        }

        else{
            for(int i = f; i < r; i++){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
    
    public circularQueue(int capacity){
        arr = new int[capacity];
    }

    public void add(int val){
        if(size == arr.length){
            System.out.println("Queue is Full");
            return;
        }
        arr[r++] = val; 
        if(r == arr.length) r = 0;
        size++;
    }

    public int remove(){
        if(size == 0){
            System.out.println("Queue is Empty!");
            return -1;
        }
        int front = arr[f];
        f++;
        if(f == arr.length) f = 0;
        size--;
        return front;
    }

    public int peek(){
        if(size == 0){
            System.out.println("Queue is Empty!");
            return -1;
        }
        return arr[f];
    }
}
public class circularArrayImple {
    public static void main(String[] args) {
        circularQueue q = new circularQueue(4);

        q.add(10);
        q.add(20);
        q.add(30);
        q.display();
        System.out.println(q.remove());
        q.display();
        q.add(40); q.add(50); //50 should be at index 0 but in queue it will be at back of 40 
        q.display();
    }
}
