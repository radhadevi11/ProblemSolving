import java.util.Scanner;

public class OnesAndZeros {
    int getFirstIndexOfZero(int n, int[] a){
        /*
        ALGORITHM:
            Step 0: if size of array is 0 or a[n-1] is 1
                        0.1: return -1 (No 0 is found)
            Step 1: For each element in the array a
                        1.1: If the current element is 0
                                1.1.1: return it's position
            Step 2: Return -1 (No 0 is found)
         */
        if(n == 0 || a[n - 1] == 1){
            return -1;
        }
        for(int i = 0; i < n; i++){
            if(a[i] == 0){
                return i;
            }
        }
        return -1;
    }

    int getCountOfZeros(int n, int[] a){
        /*ALGORITHM:
            Step 1: call getFirstIndexOfZero() and store it in the variable index
            Step 2: If index is -1
                        2.1: return 0
            Step 3: Otherwise
                        31: return n - index
         */

        int index = getFirstIndexOfZero(n , a);
        if(index == -1){
            return 0;
        }else{
            return n - index;
        }

    }

    int[] getArrayElements(int n, Scanner s){

        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = s.nextInt();
        }
        return a;
    }
    int getNOrT(Scanner s){
        int n = s.nextInt();
        return n;
    }

    void printCountOfZeroForTTestCases(int t, Scanner s){

        for(int i = 0; i < t; i++){
            int n = getNOrT(s);
            int a[] = getArrayElements(n, s);
            System.out.println(getCountOfZeros(n, a));
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        OnesAndZeros obj = new OnesAndZeros();
        int t = obj.getNOrT(s);;
        obj.printCountOfZeroForTTestCases(t, s);
    }
}
