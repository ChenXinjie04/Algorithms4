/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class Ex_1_2_4 {
    public static void main(String[] args) {
        String string1 = "hello";
        String string2 = string1;
        string1 = "world";
        /*
        The out put will be "world" followed by "hello", because the assignment
        will copy the identity of the object, not the object itself.
         */
        System.out.println(string1);
        System.out.println(string2);
    }
}
