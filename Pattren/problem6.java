// package Pattren;

public class problem6 {
    void printPattren(int n){
        for(int i =0; i < n; i++){
            for(int j =0; j < n - i; j++){
                System.out.print(j+1 + " ");
                
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        problem6 sol = new problem6();
        int n = 5; // Example size
        sol.printPattren(n);
    }
}
