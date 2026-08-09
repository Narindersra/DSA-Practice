// package Pattren;

public class problem15 {
    void printPattren(int n){
        for(int i =0;i<n;i++){
            int ch = 65; // ASCII value of 'A'
            for(int j = 0; j<n-i;j++){
                System.out.print((char)(ch) + " ");
                ch++;
            }
            System.out.println();
            
        }
    }

    public static void main(String[] args) {
        problem15 sol = new problem15();
        int n = 5; // Example size
        sol.printPattren(n);
    }
}
