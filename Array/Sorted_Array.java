// package Array;

public class Sorted_Array {
    boolean isSorted(int[] arr, int n){
        for(int i = 1; i < n; i++){
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Sorted_Array sol = new Sorted_Array();
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 4, 3, 2, 1};
        int n = arr.length;
        System.out.println(sol.isSorted(arr, n));
        System.out.println(sol.isSorted(arr2, n));
    }
}
