package task23;

public class ATM {
    private int fifties;
    private int tens;
    private int twenties;

    public final static String FIFTIES = "fifties";
    public final static String TENS = "tens";
    public final static String TWENTIES = "twenties";

    public final static int fiftiesAmount = 20;
    public final static int tensAmount = 20;
    public final static int twentiesAmount = 20;


    public ATM(int fifties, int tens, int twenties) {
        this.fifties = fifties;
        this.tens = tens;
        this.twenties = twenties;
    }

    public int getFifties() {
        return fifties;
    }

    public int getTens() {
        return tens;
    }

    public int getTwenties() {
        return twenties;
    }

    public void setFifties(int fifties) {
        this.fifties = fifties;
    }

    public void setTens(int tens) {
        this.tens = tens;
    }

    public void setTwenties(int twenties) {
        this.twenties = twenties;
    }

    @Override
    public String toString() {
        return "ATM{" +
                "fifties=" + fifties +
                ", tens=" + tens +
                ", twenties=" + twenties +
                '}';
    }

    public void addMoney(String type, int amount) {
        if (getTwenties() + amount < twentiesAmount || getFifties() + amount < fiftiesAmount || getTens() + amount < tensAmount) {
            switch (type) {
                case (FIFTIES):
                    fifties = getFifties() + amount;
                    break;
                case (TENS):
                    tens = getTens() + amount;
                    break;
                case (TWENTIES):
                    twenties = getTwenties() + amount;
                    break;
            }
        } else {
            System.out.println("Unable to add bill");
        }


    }

    public boolean getMoney(int sum) {
        int havesum = getFifties() * 50 + getTens() * 10 + getTwenties() * 20;
        if (havesum < sum) {
            return false;
        } else {
            if (sum % 10 != 0) {
                System.out.println("It is impossible to receive this amount, banknotes only 10 20 50");
                return false;
            } else {
                int amountfift = sum / 50;
                int amounttwent = (sum - amountfift * 50) / 20;
                int amountten = (sum - amountfift * 50 - amounttwent * 20) / 10;
                System.out.println("Quantity 50:  " + amountfift + "  Quantity 20:  " + amounttwent + "  Quantity 10: " + amountten);
            }
            return true;
        }
    }
}
