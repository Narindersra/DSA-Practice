// package Easy;

public class Consecutive_ones {
    void ones(int[] arr){
        int n = arr.length;
        int max = 0;
        int count = 0;
        for(int i =0; i<n; i++){
            
            if(arr[i] == 1){
                count++;
                
            }
            
            else{
                count = 0;
            }
            
            if(max < count){
                max = count;
            }
        }
        System.out.println("Maximum consecutive ones: " + max);
    }

    public static void main(String[] args) {
        Consecutive_ones sol = new Consecutive_ones();
        int[] arr = {1, 1, 0, 1, 1, 1, 0, 1}; // Example array
        sol.ones(arr);
    }
}
