import java.util.HashSet;


public class Longest_consecutive {
    void longestConsecutive(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        int longest = 1;
        for(int num: set){
            if(!set.contains(num-1)){
                int count = 1;
                int x = num;
                while(set.contains(x+1)){
                    count++;
                    x++;
                }
                longest = Math.max(longest, count);
            }
        }
        System.out.println(longest);
    }

    public static void main(String[] args) {
        Longest_consecutive lc = new Longest_consecutive();
        int nums[] = {100, 4, 200, 1, 3, 2};
        lc.longestConsecutive(nums);
    }
}
