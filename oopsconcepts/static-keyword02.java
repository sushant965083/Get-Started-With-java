package oopsconcept;

public class Books {  
    public static void main(String args[]) { 
        Book book1 = new Book("Book1");
        Book book2 = new Book("Book2");
        // System.out.println(Book.bookCount);
        Book.bookInfo();
    }  
 }

 class Book {
     String bookName;
     static int bookCount;

     Book(String bookName) {
         this.bookName = bookName;
         bookCount++;
     }

     static void bookInfo() {
         System.out.println(String.format("%s : %d", "The number of books are", bookCount));
     }
 }