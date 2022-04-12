// Enum


public class car {
    public static void main(String[] args) {
        // .values() methods that comes java.lang.ENUM class
        // that enum classes extends implicitly
        for (Day d : Day.values()) {
            System.out.println(d);
        }

        // use of constructor in Enum
        System.out.println(Day.MONDAY.dayCount);
    }
}

enum Day {
    MONDAY(1), TUESDAY(2), WEDNESDAY(3);

    final int dayCount;
    Day(int dayCount) {
        this.dayCount = dayCount;
    }

}
