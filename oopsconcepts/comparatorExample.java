// refrence baeldung & telusko youtube channel
//comparator 

package oopsconcept;
import java.util.*;
public class Books {  
    public static void main(String args[]) { 
        List<Book> list = new ArrayList<>();
        Book book1 = new Book("Book2", 200);
        Book book2 = new Book("Book1", 400);
        Book book3 = new Book("Book3", 100);
        list.add(book1);
        list.add(book2);
        list.add(book3);

        
        
        System.out.println(list);

        // important point to notice
        // sort method can also take 2 arguments
        // when using comparator 1 arg must contain the collection 
        // and other the object of the class implementing comparator
        Book o = new Book(); // Book class implementing comparator interface

        // important point is to overrid the compare method
        // compare() method returns int just like comparable
        // takes two arguments i.e two instances to compare
        Collections.sort(list, o);
        System.out.println(list);
        // for (Book bk : list) {
        //     System.out.println(bk);
        // }

        
    }  
}

class Book implements Comparator<Book>{
    private String name;
    private int price;
    private int rank;

    Book() {

    }
    Book(String name, int price) {
        this.name = name;
        this.price = price;
        // this.rank = rank;
    }

    public String getName() {
        return this.name;
    }
    public int getPrice() {
        return this.price;
    }
    public int getRank() {
        return this.rank;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String toString() {
        return "name: " + name + " : " + "price: " + price;
    }
    public int compare(Book book1, Book book2) {
        if (book1.getName().compareTo(book2.getName()) > 0) {
            return 1;
        }
        else {
            return -1;
        }
    }
}

