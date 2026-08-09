// package Pattren;

public class problem16 {
    void printPattren(int n){
        char ch = 'A';
        for(int i =0;i<n;i++){
            for(int j = 0; j<=i;j++){
                System.out.print(ch + " ");
                // Char++;
            }
            System.out.println();
            ch++;
            
        }
    }

    public static void main(String[] args) {
        problem16 sol = new problem16();
        int n = 5; // Example size
        sol.printPattren(n);
    }
}
