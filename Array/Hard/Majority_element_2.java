import java.util.ArrayList;
import java.util.List;

public class Majority_element_2 {
    public List<Integer> majorityElement(int[] nums){
        List<Integer> res = new ArrayList<>();
        int count1 = 0, count2 = 0;
        int ele1 = Integer.MIN_VALUE, ele2 = Integer.MIN_VALUE;
        for(int i =0; i< nums.length; i++){
            if(count1 == 0 && nums[i] != ele2){
                count1 = 1;
                ele1 = nums[i];
            }else if(count2 == 0 && nums[i] != ele1){
                count2 = 1;
                ele2 = nums[i];
            }else if(nums[i] == ele1){
                count1++;
            }else if(nums[i] == ele2){
                count2++;
            }else{
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == ele1) count1++;
            if(nums[i] == ele2) count2++;
        }
        if(count1 > nums.length/3) res.add(ele1);
        if(count2 > nums.length/3) res.add(ele2);
        return res;
    }

    public static void main(String[] args) {
        Majority_element_2 obj = new Majority_element_2();
        int[] nums = {3,2,3};
        List<Integer> res = obj.majorityElement(nums);
        System.out.println(res);
    }
}
