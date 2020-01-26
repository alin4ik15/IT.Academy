package Card;

public class VTB extends BankCards {

    public VTB(String name, int number) {
        super(name, number);
    }
    public void display(){
        System.out.println("Bank's name"+ name);
        System.out.println(" His number "+ number);
    }

}
