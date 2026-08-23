import java.util.HashMap;

public class Count_Subarray {
    void countSubarray(int[] arr, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int presum = 0;
        int count = 0;

        for(int i=0; i<arr.length; i++){
            presum += arr[i];
            int remove = presum - k;
            count += map.getOrDefault(remove, 0);
            map.put(presum, map.getOrDefault(presum, 0) + 1);
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        Count_Subarray cs = new Count_Subarray();
        int[] arr = {1, 2, 3, 4, 5};
        int k = 5;
        cs.countSubarray(arr, k);
    }
}
