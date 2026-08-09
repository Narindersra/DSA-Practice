// package Pattren;

public class problem19 {
    void printPattren(int n){
        int spaces = 0;
        
        for(int i =0;i<n;i++){
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }
            for(int j=0;j<spaces;j++){
                System.out.print(" ");
            }
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }
            spaces+=2;
            System.out.println();
        }

        spaces = 2*n-2;
        for(int i =0;i<n;i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            for(int j=0;j<spaces;j++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            spaces-=2;
            System.out.println();
        }
    }

    

    public static void main(String[] args) {
        problem19 sol = new problem19();
        int n = 5; // Example size
        sol.printPattren(n);
    }
}
