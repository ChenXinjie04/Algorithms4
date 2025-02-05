/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.Date;
import edu.princeton.cs.algs4.LinkedQueue;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.Transaction;

public class Ex_1_3_17 {
    public static Date readDate() {
        String date = StdIn.readString();
        String[] words = date.split("/");
        int month = Integer.parseInt(words[0]);
        int day = Integer.parseInt(words[1]);
        int year = Integer.parseInt(words[2]);
        return new Date(month, day, year);
    }

    public static Transaction[] readTransactions() {
        LinkedQueue<Transaction> q = new LinkedQueue<>();

        while (!StdIn.isEmpty()) {
            String who = StdIn.readString();
            Date when = readDate();
            double amount = StdIn.readDouble();
            q.enqueue(new Transaction(who, when, amount));
        }

        int n = q.size();
        Transaction[] transactions = new Transaction[n];
        for (int i = 0; i < n; i++) {
            transactions[i] = q.dequeue();
        }

        return transactions;
    }

    public static void main(String[] args) {
        Transaction[] transactions = readTransactions();
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }
}
