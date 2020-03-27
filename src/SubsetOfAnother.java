import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SubsetOfAnother {
    int getN(Scanner s){
        return s.nextInt();
    }
    int[] populateArray(int n, Scanner s) {
        int[] a = new int[n];
        for(int i = 0; i < n; i++){

            a[i] = s.nextInt();
        }
        return a;
    }

    Map<Integer, Integer> convertToMap(int[] a){
        Map<Integer, Integer> numMap = new HashMap<>();
        for(int i = 0; i < a.length; i++){
            numMap.put(a[i], a[i]);
        }
        return numMap;
    }

    boolean isSubset(Map<Integer, Integer> numMap, int[] b){
        for(int i = 0; i < b.length; i++){
            if(! numMap.containsKey(b[i])){
                return false;
            }
        }
        return true;
    }

    void printResult(boolean result){
        if(result){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        SubsetOfAnother subset = new SubsetOfAnother();
        Scanner s = new Scanner(System.in);

        int n = subset.getN(s);
        int m = subset.getN(s);

        int a[] = subset.populateArray(n, s);
        int b[] = subset.populateArray(m, s);

        Map<Integer, Integer> numMap = subset.convertToMap(a);
        boolean result = subset.isSubset(numMap, b);

        subset.printResult(result);

    }

}
