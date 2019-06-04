
package supermarket2;

public class Orange extends Product{

    private static double price = 2.00;
    private static char section = 'B';

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        Orange.price = price;
    }

    @Override
    public char getSection() {
        return section;
    }

    @Override
    public void setSection(char section) {
        Orange.section = section;
    }
    
}
