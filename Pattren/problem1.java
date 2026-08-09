// package Pattren;

public class problem1 {
    void printPattren(int n){
        for(int i =0; i < n; i++){
            for(int j =0; j < n; j++){
                System.out.print("* ");
                
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        problem1 sol = new problem1();
        int n = 5; // Example size
        sol.printPattren(n);
    }
}
