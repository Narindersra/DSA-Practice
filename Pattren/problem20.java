class problem20 {
    void printPattren(int n){
        int spaces = 2*n-2;
        for(int i =1;i<=2*n-1;i++){
            // Star
            int star = i;
            if(i > n){
                star = 2*n-i;
            }
            for(int j =0;j<star;j++){
                System.out.print("*");
            }
            // Space
            for(int j=0;j<spaces;j++){
                System.out.print(" ");
            }

            // Star
            for(int j =0;j<star;j++){
                System.out.print("*");
            }
            if(i<=n-1){
                spaces -= 2;
            }
            else{
                spaces += 2;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        problem20 sol = new problem20();
        int n = 3; // Example size
        sol.printPattren(n);
    }
}