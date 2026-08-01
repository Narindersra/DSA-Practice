// package Recursion;

public class ques2 {

    int show(int current, int n){
        int a = 1;
        if(n==0){
            return 0;
        }
        if(current > n){
            return 0;
        }

        System.out.print(current + " ");
            
        return show(current + 1, n);
    }
    public static void main(String[] args) {
        ques2 q = new ques2();
        q.show(1, 5);
    }
}
