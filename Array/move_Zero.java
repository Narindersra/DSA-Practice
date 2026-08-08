public class move_Zero {
    void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    void moveZero(int[] arr, int n){
        int j = -1;
        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }
        
        for(int i =j+1; i < n; i++){
            if(arr[i] != 0){
                swap(arr, i, j);
                j++;
            }
        }
    }

    public static void main(String[] args) {
        move_Zero sol = new move_Zero();
        int[] arr = {0, 1, 0, 3, 12};
        int n = arr.length;
        sol.moveZero(arr, n);
        System.out.print("Array after moving zeros: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
