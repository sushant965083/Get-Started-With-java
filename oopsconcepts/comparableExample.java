// refrence baeldung & telusko youtube channel
package oopsconcept;
import java.util.*;
public class Books {  
    public static void main(String args[]) { 
        List<Book> list = new ArrayList<>();
        Book book1 = new Book("Book1", 200);
        Book book2 = new Book("Book2", 400);
        Book book3 = new Book("Book3", 100);
        list.add(book1);
        list.add(book2);
        list.add(book3);

        // important point to notice
        // when tried to print the list without creating/overriding toString() method in Book Class
        // console was only printing refrences rather than values
        // after toString() method values were printed
        // reason we are printing a "list of Books"
        // usually we create a collection with Integer, String classes and they don't need this method
        // but while creating list with such instances like Book, Car, toString() method is required
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        // for (Book bk : list) {
        //     System.out.println(bk);
        // }

        
    }  
}

class Book implements Comparable<Book>{
    private String name;
    private int price;

    Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }
    public int getPrice() {
        return this.price;
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
    public int compareTo(Book book3) {
        if (this.getPrice() > book3.getPrice()) {
            return 1;
        }
        else {
            return -1;
        }
    }
}

