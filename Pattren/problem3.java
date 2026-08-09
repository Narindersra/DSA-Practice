// package Pattren;

public class problem3 {
    void printPattren(int n){
        for(int i =0; i < n; i++){
            for(int j =0; j <= i; j++){
                System.out.print(j+1 + " ");
                
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        problem3 sol = new problem3();
        int n = 5; // Example size
        sol.printPattren(n);
    }

}
