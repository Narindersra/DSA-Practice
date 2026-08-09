// package Pattren;

public class problem17 {
    void printPattren(int n){
        
        for(int i =0;i<n;i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            char ch = 'A';
            int breakPoint = (2*i+1)/2;
            for(int j = 0; j< 2*i+1;j++){
                System.out.print(ch);
                if(j<breakPoint){
                    ch++;
                }
                else{
                    ch--;
                }
            }
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
            
        }

    }

    public static void main(String[] args) {
        problem17 sol = new problem17();
        int n = 5; // Example size
        sol.printPattren(n);
    }
}
