public class Missing_number {
    int missingNumber(int[] arr, int n) {
        int total = (n * (n + 1)) / 2;
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            sum += arr[i];
        }
        return total - sum;
    }

    public static void main(String[] args) {
        Missing_number sol = new Missing_number();
        int[] arr = {8, 5, 4, 2, 1, 6, 3}; // Example array with a missing number
        int n = arr.length + 1; // Since one number is missing
        int missingNum = sol.missingNumber(arr, n);
        System.out.println("The missing number is: " + missingNum);
    }
}
