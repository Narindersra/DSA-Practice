public class longest_subarray {
    int max(int a, int b){
        return (a > b) ? a : b;
    }

    void longestSubarray(int[] arr, int k){
        int left = 0;
        int right = 0;
        
        int maxlen= 0;
        int n = arr.length;
        
        long sum = arr[0];
        
        while(right < n){
            while(left<=right && sum > k){
                sum -= arr[left];
                left++;
            }
            if(sum == k){
                maxlen = max(maxlen, right - left +1);
            }
            right++;
            if(right < n){
                sum += arr[right];
            }

        }
        System.out.println("The length of the longest subarray with sum " + k + " is: " + maxlen);
    }

    public static void main(String[] args) {
        longest_subarray obj = new longest_subarray();
        int[] arr = {1, 2, 3, 4, 5};
        int k = 9;
        obj.longestSubarray(arr, k);

        
    }

}
