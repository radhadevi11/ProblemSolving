import java.util.Scanner;

public class KthLargest {
    int[] sortArray(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = i+1; j < array.length; j++){
                if(array[i] > array[j]){
                    swap(array, i, j);
                }

            }
        }
        return array;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    int findKthSmallest(int k, int[] array){
        /*ALGORITHM
        Step 1: sort the array
        Step 2: return the element in the position of k-1
         */
        int[] a = sortArray(array);
        return a[k-1];
    }

    int getKOrN(Scanner s){
        return s.nextInt();
    }

    private int[] populateArray(int n, Scanner s) {
        int[] a = new int[n];
        for(int i = 0; i < n; i++){

            a[i] = s.nextInt();
        }
        return a;
    }

    void printKthSmallest(int t, Scanner s){
        for(int i = 0; i < t; i++){
            int n = getKOrN(s);
            int k = getKOrN(s);
            int[] array = populateArray(n, s);
            System.out.println(findKthSmallest(k, array));
        }
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        KthLargest obj =  new KthLargest();

        int t = obj.getKOrN(s);
        obj.printKthSmallest(t, s);
    }
}
