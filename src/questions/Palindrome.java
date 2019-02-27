package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * AlgorithmTest
 * Class: Palindrome
 * Created by hapo on 2019-02-27.
 * Description:
 *
 * A palindrome is a word that reads the same backward or forward.
 *
 * Write a function that checks if a given word is a palindrome. Character case should be ignored.
 *
 * For example, isPalindrome("Deleveled") should return true as character case should be ignored,
 * resulting in "deleveled", which is a palindrome since it reads the same backward and forward.
 *
 */
public class Palindrome {

    public static boolean isPalindrome(String word) {
        return word.toLowerCase().equals(new StringBuffer(word.toLowerCase()).reverse().toString());
//        List<String> words = new ArrayList<>(Arrays.asList(word.split("")));
//        List<String> reverseWords = new ArrayList<>(words);
//        Collections.reverse(reverseWords);
//        boolean result = true;
//        for (int i = 0; i < words.size(); i++) {
//            if(!words.get(i).toLowerCase().equals(reverseWords.get(i).toLowerCase())) result = false;
//        }
//        return result;
    }

    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }

}
