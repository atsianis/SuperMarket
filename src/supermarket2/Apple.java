
package supermarket2;

public class Apple extends Product {
    
    private static double price = 1.5;
    private static char section = 'A';

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        Apple.price= price;
    }

    @Override
    public char getSection() {
        return section;
    }

    @Override
    public void setSection(char section) {
        Apple.section = section;
    }
    
}
