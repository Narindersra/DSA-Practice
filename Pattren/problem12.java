// package Pattren;

public class problem12 {
    void printPattren(int n){
        int space = 2*n-2;
        for(int i =0;i<n;i++){
            for(int j = 0; j<i;j++){
                System.out.print(j+1);
            }
            for(int j=0;j<space; j++){
                System.out.print(" ");
            }
            for(int j = i;j>0;j--){
                System.out.print(j);
            }
            System.out.println();
            space -= 2;
        }
    }

    public static void main(String[] args) {
        problem12 sol = new problem12();
        int n = 5; // Example size
        sol.printPattren(n);
    }
}
