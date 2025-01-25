/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */


public class Ex_1_2_6 {
    public static boolean isCircularRotation(String s, String t) {
        return s.length() == t.length() && (s + s).contains(t);
    }

    public static void main(String[] args) {
        String s = "ACTGACG";
        String t = "TGACGAC";
        System.out.println(isCircularRotation(s, t));
    }
}
