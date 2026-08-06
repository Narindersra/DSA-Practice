// package Array;

public class Sorted_Array {
    boolean isSorted(int[] arr, int n){
        int count = 0;
        for(int i = 1; i < n; i++){
            if(arr[i] < arr[i-1]){
                count++;
            }
        }
        if(arr[n-1] > arr[0]){
            count++;
        }
        if(count > 1){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Sorted_Array sol = new Sorted_Array();
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 1, 2};
        int n = arr.length;
        System.out.println(sol.isSorted(arr, n));
        System.out.println(sol.isSorted(arr2, n));
    }
}
