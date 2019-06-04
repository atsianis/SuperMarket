
package supermarket;

public class Customer {
    private int numApples;
    private int numOranges;
    private int numMilk;

    public Customer() {
    }

    public Customer(int numApples, int numOranges, int numMilk) {
        this.numApples = numApples;
        this.numOranges = numOranges;
        this.numMilk = numMilk;
    }

    public int getNumApples() {
        return numApples;
    }

    public void setNumApples(int numApples) {
        this.numApples = numApples;
    }

    public int getNumOranges() {
        return numOranges;
    }

    public void setNumOranges(int numOranges) {
        this.numOranges = numOranges;
    }

    public int getNumMilk() {
        return numMilk;
    }

    public void setNumMilk(int numMilk) {
        this.numMilk = numMilk;
    }
    
    public double totalCost(){
        return Apple.getPrice()*this.numApples + Orange.getPrice()*this.numOranges + Milk.getPrice()*this.numMilk;
    }
    
    
}
