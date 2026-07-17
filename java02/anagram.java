package java02;

import java.util.Arrays;

public class anagram {

    Boolean ana(String str1, String str2) {

        char[] chars = str1.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);

        char[] chars1 = str2.toCharArray();
        Arrays.sort(chars1);
        String sorted1 = new String(chars1);

        return sorted.equals(sorted1);
    }

    public static void main(String[] args) {

        String Str1 = "listen";
        String Str2 = "islent";

        anagram obj = new anagram();
        Boolean result = obj.ana(Str1, Str2);

        System.out.println(result);
    }
}