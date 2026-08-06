public class remove_duplicate {
    int removeDuplicate(int[] arr, int n){
        int i = 0;
        for(int j = 1; j < n; j++){
            if(arr[j] != arr[i]){
                arr[i+1]= arr[j];
                i++;
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        remove_duplicate sol = new remove_duplicate();
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
        int n = arr.length;
        int newLength = sol.removeDuplicate(arr, n);
        System.out.println("New length: " + newLength);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
