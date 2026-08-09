// package Pattren;

public class problem18 {
    void printPattren(int n){
        int ch = 65 + (n-1);
        for(int i =0;i<n;i++){
            for(int j=ch - i; j<=ch; j++){
                System.out.print((char)(j) + " ");
            }
            // ch++;
            System.out.println();
            
            
        }
    } 

    public static void main(String[] args) {
        problem18 sol = new problem18();
        int n = 4; // Example size
        sol.printPattren(n);
    }
}
