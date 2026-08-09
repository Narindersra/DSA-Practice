// package Pattren;

public class problem10 {
    void printPattren(int n){
        for(int i =0; i < 2*n-1; i++){
            int star = i;
            if(i > n){
                star = 2*n - i -1;
            }
            for(int j =0; j < star; j++){
                System.out.print("*");
                
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        problem10 sol = new problem10();
        int n = 5; // Example size
        sol.printPattren(n);
    }
}
