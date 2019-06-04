
package supermarket;

public class Apple {
    private static double price;
    private static char section;

    public Apple() {
    }

    public static double getPrice() {
        return price;
    }

    public static void setPrice(double price) {
        Apple.price = price;
    }

    public static char getSection() {
        return section;
    }

    public static void setSection(char section) {
        Apple.section = section;
    }
    
    
    
}
