
package supermarket2;

public class Milk extends Product {
    
    private static double price = 5.00;
    private static char section = 'C';

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        Milk.price = price;
    }

    @Override
    public char getSection() {
        return section;
    }

    @Override
    public void setSection(char section) {
        Milk.section = section;
        
    }
    
}
