// package Recursion;

public class ques3 {

    public void printNumbers(int n) {
        // Your code goes here
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        printNumbers(n - 1);
    }
    public static void main(String[] args) {
        ques3 q = new ques3();
        q.printNumbers(5);
    }
}
