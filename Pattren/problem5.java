// package Pattren;

public class problem5 {
    void printPattren(int n){
        for(int i =0; i < n; i++){
            for(int j =0; j < n-i; j++){
                System.out.print("* ");
                
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        problem5 sol = new problem5();
        int n = 5; // Example size
        sol.printPattren(n);
    }
}
