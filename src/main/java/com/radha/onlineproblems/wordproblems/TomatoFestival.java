package com.radha.onlineproblems.wordproblems;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TomatoFestival {
    /*
    find no of digits in the N
    result = multiply 3001 with 1 to x
    if the result's digit is greater than the no of digits
    then stop
     */
    /*
    get input:
            m => string contains digits
            k => no of times to concat
            get m and k
            N = concatenateMWithKTimes(m, k)
    process input:
            result = getNoOfWaysToChangeNoOfTomatoes(N)
    Display output:
    print result+1(0000 case)

     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        TomatoFestival tomatoFestival = new TomatoFestival();
        String numString = s.next();
        int noOfTimesToConcat = s.nextInt();

        String concatString = tomatoFestival.concatenateMwithKTimes(numString,
                noOfTimesToConcat);
        long noOfWays = tomatoFestival
                .getNoOfWaysToChangeNoOfTomatoesWithnoOfDigits(concatString.length());
        long validWayToChangeNoOfTomatoes = tomatoFestival
                .getValidNoOfWaysToChangeNoOfTomatoesWithNoOfDigits(noOfWays,
                        concatString);
        if(tomatoFestival.isValueConvertable(tomatoFestival.
                concatenateMwithKTimes("0", concatString.length()),concatString)) {
            validWayToChangeNoOfTomatoes =  validWayToChangeNoOfTomatoes + 1  %
                    (long) (Math.pow(10, 9) + 7);
        }

        System.out.println(validWayToChangeNoOfTomatoes);


    }

    long getNoOfWaysToChangeNoOfTomatoes(String numString, int noOfTimesToConcat) {
        String concatenatedNumString = concatenateMwithKTimes(numString, noOfTimesToConcat);
        int noOfDigits = concatenatedNumString.length();
       return getNoOfWaysToChangeNoOfTomatoesWithnoOfDigits(noOfDigits) + 1;
    }

      long getNoOfWaysToChangeNoOfTomatoesWithnoOfDigits(int noOfDigits) {
          return (long) (Math.pow(10, noOfDigits) / 3001) % (long) (Math.pow(10, 9) + 7);
    }
    long getValidNoOfWaysToChangeNoOfTomatoesWithNoOfDigits(long noOfWays,
                                                            String concateString ) {
        /*
        set count = 0
       for i = 1 to noOfWays
              set numString = multiply i with 1 and convert it to string
              if  isValueConvertable(numString, concateString)
                      incrementCount by 1
      return count
         */
        long count = 0;
        for(int i = 1; i <= noOfWays; i++) {
            String numString = String.valueOf(i * 3001);
            if(isValueConvertable(numString, concateString)) {
                count = (count + 1) % (long) (Math.pow(10, 9) + 7);
            }
        }
        return count;
    }
    boolean  isValueConvertable(String numString, String concateString) {
        /*for each character
            is character in palce
                return true
            if set has given char
                return false
            add this char in set
            return true
      */
        Set<Character> characters = new HashSet<>();
        if(numString.length() != concateString.length()) {
            return false;
        }
        for(int i = 0; i < numString.length(); i++) {
            if(numString.charAt(i) == concateString.charAt(i)){
                continue;
            } if(characters.contains(concateString.charAt(i))) {
                        return false;
            }
            characters.add(concateString.charAt(i));
        }
        return true;
    }

      String concatenateMwithKTimes(String numString,
                                                 int noOfTimesToConcat) {
        StringBuilder numStringBuilder = new StringBuilder(numString);
        for(int i = 1; i <  noOfTimesToConcat; i++) {
           numStringBuilder.append(numString);
        }
        return numStringBuilder.toString();
    }
}
