// Moore's Voting Algorithm

public class Majority_element {
    public void findMajorityElement(int[] nums) {
        int n = nums.length;
        int count = 0;
        int element = 0;
        for(int i = 0; i < n; i++) {
            if(count == 0) {
            count = 1;
            element = nums[i];
            }
            else if(element == nums[i]){
                count++;
            }
            else{
                count--;
            }
        }

        int count1 = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == element){
                count1++;
            }
        }
        if(count1 > n/2){
            System.out.println("Majority element is: " + element);  
        }
        else{
            System.out.println("No majority element found.");
        }
    
    }

    public static void main(String[] args) {
        Majority_element solution = new Majority_element();
        int[] nums = {3, 2, 2, 4,2, 2, 3};
        solution.findMajorityElement(nums);
    }
}
