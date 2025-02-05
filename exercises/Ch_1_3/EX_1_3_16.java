/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.Date;
import edu.princeton.cs.algs4.LinkedQueue;
import edu.princeton.cs.algs4.StdIn;

public class EX_1_3_16 {
    public static Date[] readDates() {
        LinkedQueue<Date> q = new LinkedQueue<>();
        while (!StdIn.isEmpty()) {
            String date = StdIn.readString();
            String[] words = date.split("/");
            int year = Integer.parseInt(words[0]);
            int month = Integer.parseInt(words[1]);
            int day = Integer.parseInt(words[2]);
            q.enqueue(new Date(month, day, year));
        }

        int n = q.size();
        Date[] temp = new Date[n];
        for (int i = 0; i < n; i++) {
            temp[i] = q.dequeue();
        }

        return temp;
    }

    public static void main(String[] args) {
        for (Date date : readDates()) {
            System.out.println(date);
        }
    }
}
