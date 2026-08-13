public class Sort_array_0_1_2 {

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    void sortCOlors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        while (mid <= high) {
            switch (nums[mid]) {
                case 0:
                    swap(nums, low++, mid++);
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(nums, mid, high--);
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Sort_array_0_1_2 solution = new Sort_array_0_1_2();
        int[] nums = {2, 0, 2, 1, 1, 0};
        solution.sortCOlors(nums);
        System.out.print("Sorted array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
