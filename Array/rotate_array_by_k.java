public class rotate_array_by_k {

    void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    void rotateArray(int[] arr, int n, int d){
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
    }

    public static void main(String[] args) {
        rotate_array_by_k sol = new rotate_array_by_k();
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int d = 2; // Number of positions to rotate
        sol.rotateArray(arr, n, d);
        System.out.print("Array after rotation: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
