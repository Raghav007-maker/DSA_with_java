package classWork.Array_Assignment;

public class ex1 {
    public static void main(String[] args) {

        book[] Books=new book[3];
        Books[0]=new book("Pride and Prejudice","jane Austen");
        Books[1]=new book("Animal farm","George Orwell");
        Books[2]=new book("The Guide","RK.Narayan");
      
        for(int i=0;i<Books.length;i++){
            System.out.println(Books[i].title+" "+Books[i].author);
        }
    }
}
class book{
    public String title;
    public String author;

    public book(String title,String author){
        this.title=title;
        this.author=author;
    }
}
