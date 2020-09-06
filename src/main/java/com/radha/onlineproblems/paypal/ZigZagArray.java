package com.radha.onlineproblems.paypal;
/*
eg: 4 3 7 8 6 2 1
for each element
    take adjacentElement
    if !isElementInZigZagOrder(ele1, ele2, pos)
        swapElement(ele1, ele2)


isElementInZigZagOrder(ele1, ele2, pos)
    if pos is even
        return true if ele1 is less than ele2, false otherwise
    return true if ele1 is greater than ele2, false otherwise
 */



public class ZigZagArray {
    void makeArrayZigZag(int[] numbers, int size) {
        for(int i = 0; i < size - 1; i++) {
            if(!isElementInZigZagOrder(numbers[i], numbers[i + 1], i)) {
                swap(numbers, i, i + 1);
            }
        }
    }

     void swap(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

     boolean isElementInZigZagOrder(int number1, int number2, int position) {
        if(position % 2 == 0) {
            return number1 < number2;
        }
        return number1 > number2;
    }

    void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
    void printZigZagArray(int[] numbers, int size) {
        makeArrayZigZag(numbers, size);
        printArray(numbers);
    }
}
