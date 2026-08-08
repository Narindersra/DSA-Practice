public class largest_element {
    void Largest(int[] arr, int n){
        int max = arr[0];
        
        for(int i =0; i < n; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);

    }

    public void main(String[] args) {
        largest_element sol = new largest_element();
        int[] arr = {5, 2, 8, 4, 1};
        int n = arr.length;
        sol.Largest(arr, n);
    }
    
}
