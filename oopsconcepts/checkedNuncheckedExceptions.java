// code example refrenced from Coding With John - Youtube


// checked exceptions

package oopsconcept;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Books {
    public static void main(String[] args) {
        try {
            readBook("book.txt");
        }
        catch (Exception e) {
            System.out.println("reading");
        }
    }

    private static void readBook(String bookName) throws FileNotFoundException {
        FileReader file = new FileReader(bookName);
        

    } 
}

// unchecked exceptions
package oopsconcept;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Books {
    public static void main(String[] args) {
        String v = null;
        readString(v);
    }

    private static void readString(String str) {
        try {
            System.out.println(str.length());
        }
        catch (NullPointerException npe) {
            System.out.println("Can't find the length of null");
        }
    } 
}

