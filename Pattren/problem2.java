// package Pattren;

public class problem2 {
    void printPattren(int n){
        for(int i =0; i < n; i++){
            for(int j =0; j <= i; j++){
                System.out.print("* ");
                
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        problem2 sol = new problem2();
        int n = 5; // Example size
        sol.printPattren(n);
    }
}
