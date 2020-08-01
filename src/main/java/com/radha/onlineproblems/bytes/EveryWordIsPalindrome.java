package com.radha.onlineproblems.bytes;

public class EveryWordIsPalindrome {
    boolean isEveryWordPalindrome(String sentence) {
        String[] words = sentence.split(" ");
        for(String word : words) {
            if(!isPalindrome(word)) {
                return false;
            }
        }
        return true;
    }

     boolean isPalindrome(String word) {
        /*
        eg:
        eg:TOM sp => 0         ep => 2
        eg: NOON sp => 0,1,2       ep=> 3,2,1
        MOM       sp => 0, 1         ep => 2, 1

        0  == 2  word[0] word[2]
        1 == 1

        0 < 3
        1 < 2
        2 < 1 => fails
       while(sp < ep)
               if both pointer points same character
                         increment sp by 1 and decrement ep by
              otherwise
                        return false

     return true



         */
        int startPointer = 0;
        int endPointer = word.length()-1;
        while(startPointer < endPointer) {
            System.out.println("Start Pointer = "+startPointer);
            System.out.println("End Pointer = "+endPointer);
            System.out.println(word.charAt(startPointer)+":" + word.charAt(endPointer));
            if(word.charAt(startPointer) != word.charAt(endPointer)) {
                System.out.println("Not matches");
                return false;
            }
            startPointer++;
            endPointer--;
        }
         System.out.println("Palindrome");
        return true;
    }
}
