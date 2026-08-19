import java.util.ArrayList;
import java.util.Collections;

public class Leader_in_Array {
    void Leader(int arr[], int n){
        ArrayList<Integer> leaders = new ArrayList<>();
        int max_from_right = arr[n-1];
        leaders.add(max_from_right);
        for(int i=n-2;i>=0;i--){
            if(max_from_right<arr[i]){
                max_from_right = arr[i];
                leaders.add(max_from_right);
            }
        }
        Collections.reverse(leaders);
        System.out.println(leaders);
    }

    public static void main(String[] args) {
        Leader_in_Array li = new Leader_in_Array();
        int arr[] = {16, 17, 4, 3, 5, 2};
        int n = arr.length;
        li.Leader(arr, n);
    }
}
    
            

    

