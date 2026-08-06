public class second_largest {
    void SLargest(int[] arr, int n){
        int largest = arr[0];
        int Slargest = Integer.MIN_VALUE;
        
        for(int i = 1; i<n; i++){
            if(arr[i] > largest){
                Slargest = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > Slargest){
                Slargest = arr[i];
            }
        }
        System.out.println(Slargest);
        
    }

    void Ssmalest(int[] arr, int n){
        int smallest = arr[0];
        int Ssmallest = Integer.MAX_VALUE;
        
        for(int i = 1; i<n; i++){
            if(arr[i] < smallest){
                Ssmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i] > smallest && arr[i] < Ssmallest){
                Ssmallest = arr[i];
            }
        }
        System.out.println(Ssmallest);
        
    }

    public void main(String[] args) {
        second_largest sol = new second_largest();
        int[] arr = {5, 2, 8, 8, 1};
        int n = arr.length;
        sol.SLargest(arr, n);
        sol.Ssmalest(arr, n);
    }
}
