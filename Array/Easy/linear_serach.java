public class linear_serach {
    void linearSearch(int[] arr, int n, int target){
        for(int i = 0; i < n; i++){
            if(arr[i] == target){
                System.out.println("Element found at index: " + i);
                return;
            }
        }
        System.out.println("Element not found in the array.");
    }

    public static void main(String[] args) {
        linear_serach sol = new linear_serach();
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int target = 3; // Element to search for
        sol.linearSearch(arr, n, target);
    }
}
