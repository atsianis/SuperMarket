
package supermarket;

public class Supermarket {
    
    /*
    θα μπορουσα να φτιαξω μια abstract superclass product απο την οποια θα κληρονομουν τα χαρακτηριστικα
    τους και οι υπολοιπες αλλα τις εφτιαξα ξεχωριστα
    */

    public static void main(String[] args) {
       Apple.setPrice(1.5);
       Apple.setSection('A');
       Orange.setPrice(2.00);
       Orange.setSection('B');
       Milk.setPrice(5.00);
       Milk.setSection('C');
       
       Customer c1 = new Customer (4,3,1);
       System.out.println(c1.totalCost());
    }
    
}
