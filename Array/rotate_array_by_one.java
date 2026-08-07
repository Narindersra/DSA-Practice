public class rotate_array_by_one {
    void rotateArray(int[] arr, int n){
        int temp = arr[0];
        for(int i = 1; i < n; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
    }

    public static void main(String[] args) {
        rotate_array_by_one sol = new rotate_array_by_one();
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        sol.rotateArray(arr, n);
        System.out.print("Array after rotation: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
