-- Static Keyword
	-> From baeldung
	-> Telusko https://www.youtube.com/watch?v=qRCEdWQ0f4Q

-- static variable

package oopsconcept;

class Book {
    String name;
    String author;

    static String color;

    public void returnAllInformation() {
        System.out.println(name + " : " + author + " : " + color);
    }
}

public class Books {
    public static void main(String[] args) {
        Book bk = new Book();
        bk.name = "Book1";
        bk.author = "Author 1";
		
        /*here, we used object to access static field
        not wrong, but better to use class while accessing members */
		
        // bk.color = "Red"; 
		
        Book.color = "Red";
        bk.returnAllInformation();
    }
}

-- static method

package oopsconcept;

class Book {
    String name;
    String author;

    static String color;

    public void returnAllInformation() {
        System.out.println(name + " : " + author + " : " + color);
    }
	
	// a static method
    public static void numberOfBooks() {
        System.out.println("Many Books");
    }
}

public class Books {
    public static void main(String[] args) {
        
		// no object is required to access static fields and methods
		// can be directly accessed with the class name
        Book.numberOfBooks();
    }
}


-- static block

package oopsconcept;

class Book {
    String name;
    String author;

    static String color;
	
	// static block
    static {
		color = "Red";
    }

    public Book() {
        name = "Book 1";
        author = "Author 1";
		
        // below we are using static field inside constructor
        // everytime an object is created, static varaible will be called too
        // not wrong but we can use static blocks
		
        // color = "Red";
    }
    public void returnAllInformation() {
        System.out.println(name + " : " + author + " : " + color);
    }
}

public class Books {
    public static void main(String[] args) {
        Book bk = new Book();
        bk.returnAllInformation();
    }
}

