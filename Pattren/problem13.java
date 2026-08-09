// package Pattren;

public class problem13 {
    void printPattren(int n){
        int num =1;
        for(int i =0;i<n;i++){
            for(int j = 0; j<i;j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
            
        }
    }

    public static void main(String[] args) {
        problem13 sol = new problem13();
        int n = 5; // Example size
        sol.printPattren(n);
    }
}
