package Card;

 public class BPS extends BankCards {
     public BPS(String name, int number) {
         super(name, number);
     }
     public void display(){
         System.out.println(" Bank's name "+ name);
         System.out.println(" His number "+ number);
     }

 }
