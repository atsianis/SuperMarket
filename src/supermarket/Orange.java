
package supermarket;

public class Orange {
    
    private static double price;
    private static char section;

    public Orange() {
    }

    public static double getPrice() {
        return price;
    }

    public static void setPrice(double price) {
        Orange.price = price;
    }

    public static char getSection() {
        return section;
    }

    public static void setSection(char section) {
        Orange.section = section;
    }
    
    
}
