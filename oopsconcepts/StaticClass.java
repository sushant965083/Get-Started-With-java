-- static class

package oopsconcept;

class Book {
    private static String message = "This is a Book!";

    // a nested static class
    public static class NestedBook {

        // nested static class can only access static methods and variables from 
        // the enclosed class 
        void displayMesasge() {
            System.out.println("The message is " + message);
        }
    }

    // a non static nested class -- also called inner class
    public class simpleBook {
        // can access static as well as non-static data memers and fields from outer class
        void displayMesasge() {
            System.out.println("Msg from non static nested class is " + message);
        }
    }


    
}

public class Books {
    public static void main(String[] args) {
        Book.NestedBook bk = new Book.NestedBook();
        bk.displayMesasge();

        Book books = new Book();
        Book.simpleBook book = books.new simpleBook();
        book.displayMesasge();

    }
}
