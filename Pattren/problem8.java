// package Pattren;

public class problem8 {
    void printPattren(int n){
        for(int i =0; i < n; i++){
            // space
            for(int j =0; j < i; j++){
                System.out.print(" ");
            }
            // stars
            for(int j =0; j < 2*n - (2*i+1) ; j++){
                System.out.print("*");
                
            }
            for(int j =0; j < i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        problem8 sol = new problem8();
        int n = 5; // Example size
        sol.printPattren(n);
    }
}
