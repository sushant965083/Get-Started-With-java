package oopsconcept;

enum EnumDemo01 {
    // List of Values that don't change
    RED("Stop!"), YELLOW("Get Ready!"), GREEN("Go!!");

    // private variables or final variables so that value cannot be changed
    private String meaning;

    // only private constructor can be created in enum
    private EnumDemo01(String meaning) {
        this.meaning = meaning;
    }

    public String getMeaning() {
        return this.meaning;
    }


}

public class EnumDemo {
    public static void main(String[] args) {
        // if meaning variable in enum is not private or final
        // the below operation can change the value, thus variables are made private
        
        // EnumDemo01.RED.meaning = "adasdad";
        EnumDemo01[] arr = EnumDemo01.values();
        for (EnumDemo01 val : arr) {
            System.out.println(val.name() + " : " + val.getMeaning());
        }
    }
}

