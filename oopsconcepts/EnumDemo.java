package oopsconcept;

enum EnumDemo01 {
    // List of Values that don't change
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;    
}


public class EnumDemo {
    public static void main(String[] args) {
        EnumDemo01 dem = EnumDemo01.TUESDAY;
        System.out.println(dem);
    }
}

