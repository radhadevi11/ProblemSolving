package com.radha.onlineproblems.stack;

import java.util.*;

public class MinAtPopStack {


    List<Integer> possibleMinimumList = new ArrayList<>();
    Stack<Integer> numbers = new Stack<>();
    int firstElement;
    public List<Integer> getPossibleMinimumList() {
        return possibleMinimumList;
    }

    public void push(int element) {
        /*1) if the list is empty
        put the element in the list
        set firstElement as this element

        2) otherwise
        if the element is less than or equal to firstElement
        put the element in the correct position

        3) push the element into the stack

         */
        if(possibleMinimumList.isEmpty()) {
            possibleMinimumList.add(element);
            firstElement = element;
        }
        else {
            if (element <= firstElement) {
                putElementInTheCorrectPosition(element);
            }
        }
        numbers.push(element);



    }

     void putElementInTheCorrectPosition( int element) {
        // 0, 1, 1
         if(element > possibleMinimumList.get(possibleMinimumList.size() - 1)) {
             possibleMinimumList.add(element);
         }
         else{
             for(int i = 0; i < possibleMinimumList.size(); i++) {
                 if(possibleMinimumList.get(i) >= element) {
                     possibleMinimumList.add(i, element);
                     break;
                 }
             }
         }

    }

    void printMinAtPop() {
        /*
        Step 0: get the top element
        Step 1: if the possibleMinimumList has top element
                    print the first element in the possibleMinimumList
                    remove the top element from the possibleMinimumList list
        Step 2: otherwise
                    print the first element in the possibleMinimumList
        Step 3: pop the element
         */
        try {
             numbers.peek();
        }catch (EmptyStackException e){
            throw new RuntimeException("Stack is empty ", e);
        }
        Integer curElement = numbers.peek();
        System.out.println(possibleMinimumList.get(0));
        possibleMinimumList.remove(curElement);

        numbers.pop();
    }

    void insertElement (int element, int startIndex, int endIndex) {
        System.out.println("StartIndex "+ startIndex);
        System.out.println("endIndex "+ endIndex);
        if(startIndex == endIndex ) {
            System.out.println("startIndex == endIndex");
            if(possibleMinimumList.get(startIndex) < element) {
                System.out.println("element greater than list element");
                possibleMinimumList.add(startIndex+1, element);
            }
            else {
                System.out.println("element less than list element");
                possibleMinimumList.add(startIndex, element);
            }
        }
        else {
            int midPosition = (endIndex + startIndex) / 2;
            System.out.println("midPosition=" + midPosition);
            if (element > possibleMinimumList.get(midPosition)) {
                System.out.println("Recursive call for element greater than mid element");
                System.out.println("**************************************");
                insertElement(element, midPosition + 1, endIndex);
            } else {
                System.out.println("Recursive call for element less than mid element");
                System.out.println("**************************************");
                insertElement(element, startIndex, midPosition);
            }
        }
    }

     int getPositionToInsertElement(int element) {
        /*
         if the element is less than or equal to the first element in the list
            return 0th position

        if the element is greater than or equal to the last element in the list
	        return size

        set startPosition as 0 and endPosition as size - 1
        while endPosition is not equal to startPosition do
            find midPosition
            find midElement
            if the element is less than midElement
                set endPosition as midPosition
            Otherwise
                set startPosition as midPosition + 1
        return endPosition
         */
         if(element <= possibleMinimumList.get(0)) {
             return 0;
         }
         if(element >= possibleMinimumList.get(possibleMinimumList.size() - 1)) {
             return possibleMinimumList.size();
         }
        int startPosition = 0;
        int endPosition = possibleMinimumList.size() - 1;

        while (endPosition != startPosition) {
            int midPosition = (startPosition + endPosition) / 2;
            int midElement = possibleMinimumList.get(midPosition);
            if(element < midElement) {
                endPosition = midPosition;
            } else {
                startPosition = midPosition + 1;
            }

        }
        return endPosition;
    }
}
