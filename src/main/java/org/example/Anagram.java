package org.example;

import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String case1, String case2){
        if(case1.length() != case2.length())
            return false;

        char[] case1Ar = case1.toUpperCase().toCharArray();
        char[] case2Ar = case2.toUpperCase().toCharArray();

        Arrays.sort(case1Ar);
        Arrays.sort(case2Ar);

        return Arrays.equals(case1Ar, case2Ar);
    }
}
