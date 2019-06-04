
package supermarket2;

import java.util.ArrayList;
import java.util.List;

public class Supermarket2 {
    
    public static void main(String[] args){
    
    Apple a1 = new Apple();
    Apple a2 = new Apple();
    Apple a3 = new Apple();
    Apple a4 = new Apple();
    
    Orange o1 = new Orange();
    Orange o2 = new Orange();
    Orange o3 = new Orange();
    
    Milk m1 = new Milk();
    
    List<Product> bag = new ArrayList();
    bag.add(a1);
    bag.add(a2);
    bag.add(a3);
    bag.add(a4);
    bag.add(o1);
    bag.add(o2);
    bag.add(o3);
    bag.add(m1);
    
    double price=0.0;
    for (Product p : bag ){
        price += p.getPrice();
    }
    
    System.out.println(price);
    
    }
}
