package dev.zwazel.medium;

/**
 * Write a program that takes two strings as input and checks whether they are anagrams of each other.
 * An anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 * For example, “listen” and “silent” are anagrams of each other
 */
public class Anagrams {
    public static boolean isAnagram(String first, String second) {
        first = first.toLowerCase().replace(" ", "");
        second = second.toLowerCase().replace(" ", "");
        int count = 0;

        if (first.length() == second.length()) {


            // Listen
            // Silent
            for (int i = 0; i < second.length(); i++) {
                if (second.matches(String.valueOf(first.charAt(i)))) {
                    count++;
                }
            }
        }

        return count == first.length();
    }
}
