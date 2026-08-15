public class Maximum_subarray_sum {
    void maxSubArraySum(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < n; i++) {
            currentSum += nums[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        System.out.println("Maximum subarray sum is: " + maxSum);
    }

    public static void main(String[] args) {
        Maximum_subarray_sum solution = new Maximum_subarray_sum();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        solution.maxSubArraySum(nums);
    }
}
