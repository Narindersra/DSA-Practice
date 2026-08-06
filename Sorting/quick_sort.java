public class quick_sort {
    int Quick(int[] arr,int low, int high){
        int pivot = arr[low];
        int i = low; 
        int j =high;
        while(i < j){
            while(arr[i] <= pivot && i<=high-1){
                i++;
            }
            while(arr[j] > pivot && j>=low+1){
                j--;
            }
            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }
    
    void quickSort(int[] arr, int low , int high){
        if(low < high){
            int partition = Quick(arr, low, high);
            quickSort(arr, low, partition-1 );
            quickSort(arr, partition+1, high);
        }
    }
    
    public static void main(String[] args) {
        quick_sort sol = new quick_sort();
        int[] arr = {5, 2, 8, 4, 1};
        int n = arr.length;
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
        sol.quickSort(arr, 0, n-1);
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
