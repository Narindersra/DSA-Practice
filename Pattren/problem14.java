// package Pattren;

public class problem14 {
    void printPattren(int n){
        int Char = 65; // ASCII value of 'A'
        for(int i =0;i<n;i++){
            for(int j = 0; j<=i;j++){
                System.out.print((char)(Char + j) + " ");
                // Char++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        problem14 sol = new problem14();
        int n = 5; // Example size
        sol.printPattren(n);
    }
}
