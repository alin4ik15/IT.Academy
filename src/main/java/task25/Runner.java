package task25;

import task25.banks.BPSBank;
import task25.banks.VTBBank;
import task25.card.BankCards;

public class Runner {

    public static void main(String[] args) {
        BankCards b1 = new VTBBank(" VTB ", 546);
        b1.display();
        BankCards b2 = new BPSBank(" BPS ", 584);
        b2.display();
    }
}
