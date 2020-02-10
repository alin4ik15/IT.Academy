package task25.banks;

import task25.card.BankCards;

public class BPSBank extends BankCards {
    private String name;
    private int number;

    public BPSBank(String name, int number) {
        super(name, number);
    }

    public void display() {
        System.out.println(" Bank's name " + name);
        System.out.println(" His number " + number);
    }
}
