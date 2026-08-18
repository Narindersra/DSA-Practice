public class Next_permutation {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int indx = -1;
        for(int i=n-2; i>=0;i--){
            if(nums[i]<nums[i+1]){
                indx = i;
                break;
            }
        }

        int left = 0;
        int right = n-1;

        if(indx == -1){
            while(left < right){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
            return;
            
        }
        for(int i=n-1;i>indx;i--){
            if(nums[i]>nums[indx]){
                int temp = nums[i];
                nums[i] = nums[indx];
                nums[indx] = temp;
                break;
            }
            
        }
        int left1 = indx + 1;
        int right1 = n - 1;

        while (left1 < right1) {
            int temp = nums[left1];
            nums[left1] = nums[right1];
            nums[right1] = temp;

            left1++;
            right1--;
        }
    }

    public static void main(String[] args) {
        Next_permutation np = new Next_permutation();
        int nums[] = {1, 2, 3};
        np.nextPermutation(nums);
        System.out.println("Next permutation: " + java.util.Arrays.toString(nums));
    }
}
