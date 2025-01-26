/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class Transaction {
    private final String who;
    private final SmartDate when;
    private final double amount;

    public Transaction(String who, SmartDate when, double amount) {
        this.who = who;
        this.when = when;
        this.amount = amount;
    }

    public String who() {
        return who;
    }

    public SmartDate when() {
        return when;
    }

    public double amount() {
        return amount;
    }

    public String toString() {
        return who + " " + when + " " + amount;
    }

    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null) return false;
        if (this.getClass() != that.getClass()) return false;

        Transaction other = (Transaction) that;

        if (!this.who.equals(other.who)) return false;
        if (!this.when.equals(other.when)) return false;
        if (this.amount != other.amount) return false;

        return true;
    }

    public static void main(String[] args) {

    }
}
