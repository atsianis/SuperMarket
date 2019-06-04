
package supermarket;

public class Milk {
    private static double price;
    private static char section;

    public Milk() {
    }

    public static double getPrice() {
        return price;
    }

    public static void setPrice(double price) {
        Milk.price = price;
    }

    public static char getSection() {
        return section;
    }

    public static void setSection(char section) {
        Milk.section = section;
    }
    
    
}
