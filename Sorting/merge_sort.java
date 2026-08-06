import java.util.ArrayList;
import java.util.List;

public class merge_sort {
    void merge(int[] arr, int low, int mid, int high){
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;
        
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
                
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }
        while(right <= high){
            temp.add(arr[right]);
            right++;
        }
        for(int i = low; i <= high; i++){
            arr[i] = temp.get(i - low);
        }
    }
    
    void mergeSort(int[] arr,int low,int high){
        if(low >= high){
            return;
        }
        int mid = (low + high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);
        
    }
    
    public static void main(String[] args) {
        merge_sort sol = new merge_sort();
        int[] arr = {5, 2, 8, 4, 1};
        int n = arr.length;
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
        sol.mergeSort(arr, 0, n-1);
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
