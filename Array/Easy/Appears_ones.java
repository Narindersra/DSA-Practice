// package Easy;

public class Appears_ones {
    void Number(int[] arr){
        int n = arr.length;
        int XOR = 0;
        for(int i =0; i<n;i++){
            XOR = XOR ^ arr[i];
        }
        System.out.println("The number that appears only once is: " + XOR); 
    }

    public static void main(String[] args) {
        Appears_ones sol = new Appears_ones();
        int[] arr = {2, 3, 5, 4, 5, 3, 4}; // Example array
        sol.Number(arr);
    }
}
