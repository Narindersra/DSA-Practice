// package Pattren;

public class problem4 {
    void printPattren(int n){
        for(int i =0; i < n; i++){
            for(int j =0; j <= i; j++){
                System.out.print(i+1 + " ");
                
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        problem4 sol = new problem4();
        int n = 5; // Example size
        sol.printPattren(n);
    }
}
