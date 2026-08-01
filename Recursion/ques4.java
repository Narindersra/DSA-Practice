import java.util.Scanner;

public class ques4 {

    public static int NnumbersSum(int N) {
        if (N <= 0) {
            return 0;
        }

        return N + NnumbersSum(N - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = sc.nextInt();

        int sum = NnumbersSum(N);

        System.out.println("Sum of first " + N + " numbers = " + sum);

        sc.close();
    }
}