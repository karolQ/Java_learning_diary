package String;

import static java.lang.System.out;

public class CharToString {
    /**
     * two ways of transferring a char array to String
     *
     * And a misunderstanding way
     */

    // misunderstanding way of converting a char array to String:
    public static void charToString0(char[] ch){
        out.println(ch.toString());
    }

    // 1. new String()
    // https://stackoverflow.com/questions/23856703/difference-between-new-stringchar-and-char-tostring
    public static void charToString1(char[] ch){
        out.println(new String(ch));
    }

    // 2. String.valueOf()

    public static void charToString2(char[] ch){
        out.println(String.valueOf(ch));
    }

    public static void main(String[] args) {
        char[] ch = new char[]{'a', 'b','c', 'd'};

        charToString0(ch);
        charToString1(ch);
        charToString2(ch);
    }
}
