package oopsconcept;


public class ConstructorExample {
    public static void main(String[] args) {
        Constructor01 c = new Constructor01("mango");
        c.displayData();

        //copy constructor
        Constructor01 c1 = new Constructor01("jkabasbasbdas", 28);
        //here passing c1 object to c2
        // refrence Baeldung
        Constructor01 c2 = new Constructor01(c1);
        c2.displayData();
    }
    
}

class Constructor01 {

    String name;
    int age;

    //no-args constructor
    public Constructor01() {
        this.name = "Name1";
        this.age = 26;
    }

    //paramterized constructor
    public Constructor01(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //chained constructor
    public Constructor01(String val) {
        this(val, 44);
        
    }

    //copy constructor
    public Constructor01(Constructor01 other) {
        this.name = other.name;
        this.age = other.age;
    }

    void displayData() {
        System.out.println(String.format("%s %d", name, age));
    }
}
