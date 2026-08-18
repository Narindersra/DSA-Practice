

public class Rearrange_array {
    void rearrange(int nums[]){
        int[] ans = new int[nums.length];
        int pos = 0;
        int neg = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= 0){
                ans[pos] = nums[i];
                pos += 2;
            }
            else{
                ans[neg] = nums[i];
                neg += 2;
            }
        }
        System.out.println("Rearranged array: " + java.util.Arrays.toString(ans));
    }

    public static void main(String[] args) {
        Rearrange_array rearrange = new Rearrange_array();
        int nums[] = {3, 1, -2, -5, 2, -4};
        rearrange.rearrange(nums);
    }

}
