package com.radha.onlineproblems;
import org.apache.commons.lang3.mutable.MutableBoolean;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static java.lang.Math.abs;

public class PairwiseConsecutiveElementsInStack {

    Stack<Integer> numbers = new Stack<>();

    void push(int element) {
        numbers.push(element);
    }
    List<Integer> getPairwiseConsecutiveDifferenceList (Stack<Integer> numbers) throws IllegalArgumentException {
        /*
        Step 0: set lastPoppedElement to 0 and isFirstElement to true
        Step 1: create oddPairDifferences list
        Step 2: create evenPairDifferences list
        Step 3: while true
                    3.1: if the element going to pop is firstElement
                            3.1.1: pop the top element and assign it to firstElement
                            3.1.2: assign isFirstElement to false
                            3.1.3: if stack is empty
                                    3.1.3.1: throw exception
                            3.1.4: otherwise
                                    assign lastPoppedElement to result of
                                                                populatePairDifferencesList()
                    3.2: otherwise
                           3.2.1: if stack is empty
                           3.2.2: return evenPairDifferences
                           3.2.3: otherwise
                                    3.2.3.1: assign firstElement to result of populatePairDifferencesList()
                                    3.2.3.2: if stack is empty
                                                3.2.3.2.1: return oddPairDifferences
                                    3.2.3.3: otherwise
                                                3.2.3.3.1: assign lastPoppedElement to result of
                                                                populatePairDifferencesList()



         */
        boolean isFirstElement = true;
        int lastPoppedElement = 0;
        List<Integer> oddPairDifferences = new ArrayList<>();
        List<Integer> evenPairDifferences = new ArrayList<>();
        if(numbers.isEmpty()) {
            throw new IllegalArgumentException("can not find pair difference with empty stack");
        }
        while(true) {

            if(isFirstElement) {
                System.out.println("First element");
                Integer firstElement = numbers.pop();
                isFirstElement = false;
                if (numbers.isEmpty()) {
                    throw new IllegalArgumentException("can not find pair difference with one element");
                }
                else {
                     System.out.println("Second element");
                     lastPoppedElement = populatePairDifferencesList(evenPairDifferences, firstElement, numbers);
                }
            } else {
                if(numbers.isEmpty()) {
                    System.out.println("returning even pairs");
                    return evenPairDifferences;
                } else {
                    int firstElement = populatePairDifferencesList(oddPairDifferences, lastPoppedElement, numbers);
                    if(numbers.isEmpty()) {
                        System.out.println("returning odd pairs");
                        return oddPairDifferences;
                    } else {
                        lastPoppedElement = populatePairDifferencesList(evenPairDifferences, firstElement, numbers);
                    }
                }
            }
            System.out.println("*********************");
        }

    }

    int populatePairDifferencesList(List<Integer> pairDifferences, int element, Stack<Integer> numbers) {
        /*
        3.1.4.1: pop top element assign it to poppedElement
        3.1.4.2: find difference between element and poppedElement
        3.1.4.3: add the difference in the pairDifferences
        3.1.4.4: return poppedElement
         */
        Integer poppedElement = numbers.pop();
        pairDifferences.add(abs(element - poppedElement));
        System.out.println("adding into list "+pairDifferences);
        return poppedElement;
    }

    boolean isPairWiseConsecutive(Stack<Integer> numbers) {
        List<Integer> pairwiseConsecutiveDifferenceList = getPairwiseConsecutiveDifferenceList(numbers);
        for(int num : pairwiseConsecutiveDifferenceList) {
            if(num != 1) {
                return false;
            }
        }
        return true;
    }

    boolean isPairWiseConsecutiveWithoutUsingList(Stack<Integer> numbers) {
        /*
        step 0: isFirstElement to true
        Step 1: set isOddNumberOfElementsPairWiseConsecutive to true
        Step 2: set isEvenNumberOfElementsPairWiseConsecutive to true
        Step 3: while true
                    3.1: if the element going to pop is firstElement
                            3.1.1: pop the top element and assign it to firstElement
                            3.1.2: assign isFirstElement to false
                            3.1.3: if stack is empty
                                    3.1.3.1: throw exception
                            3.1.4: otherwise
                                    assign lastPoppedElement to result of
                                                                getPoppedElement()
                    3.2: otherwise
                           3.2.1: if stack is empty
                           3.2.2: return isEvenNumberOfElementsPairWiseConsecutive
                           3.2.3: otherwise
                                    3.2.3.1: assign firstElement to result of getPoppedElement()
                                    3.2.3.2: if stack is empty
                                                3.2.3.2.1: return isEvenNumberOfElementsPairWiseConsecutive
                                    3.2.3.3: otherwise
                                                3.2.3.3.1: assign lastPoppedElement to result of
                                                                getPoppedElement()

         */
        MutableBoolean isEvenNumberOfElementsPairWiseConsecutive = new MutableBoolean(true);
        MutableBoolean isOddNumberOfElementsPairWiseConsecutive = new MutableBoolean(true);
        boolean isFirstElement = true;
        int lastPoppedElement = 0;

        if(numbers.isEmpty()) {
            throw new IllegalArgumentException("can not find pair difference with empty stack");
        }

        while(true) {

            if(isFirstElement) {
                System.out.println("First element");
                Integer firstElement = numbers.pop();
                isFirstElement = false;
                if (numbers.isEmpty()) {
                    throw new IllegalArgumentException("can not find pair difference with one element");
                }
                else {
                    System.out.println("Second element");
                    lastPoppedElement = getPoppedElement(firstElement, numbers, isEvenNumberOfElementsPairWiseConsecutive);
                }
            } else {
                if(numbers.isEmpty()) {
                    System.out.println("returning even pairs");
                    return isEvenNumberOfElementsPairWiseConsecutive.toBoolean();
                } else {
                    System.out.println("getting odd position value");
                    int firstElement = getPoppedElement(lastPoppedElement, numbers, isOddNumberOfElementsPairWiseConsecutive);
                    System.out.println("first element =" +firstElement);
                    if(numbers.isEmpty()) {
                        System.out.println("returning odd pairs");
                        return isOddNumberOfElementsPairWiseConsecutive.toBoolean();
                    } else {
                        System.out.println("getting even position value");
                        lastPoppedElement = getPoppedElement( firstElement, numbers, isEvenNumberOfElementsPairWiseConsecutive);
                        System.out.println("last popped element "+lastPoppedElement);
                    }
                }
            }
            System.out.println("*********************");
        }

    }

    int getPoppedElement(int element, Stack<Integer> numbers, MutableBoolean isPairWiseConsecutive) {
        System.out.println("finding difference");
        Integer poppedElement = numbers.pop();
        System.out.println(poppedElement+" and "+ element);
        int difference = abs(element - poppedElement);
        if(isPairWiseConsecutive.getValue() && difference != 1) {
            System.out.println("difference is not 1");
            isPairWiseConsecutive.setValue(false); ;
        }
        return poppedElement;

    }


}
