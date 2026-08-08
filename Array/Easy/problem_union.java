import java.util.ArrayList;
import java.util.List;

public class problem_union {
    void Unionfunc(int[] arr1, int[] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;
        List<Integer> union = new ArrayList<>();
        
        int size = union.size();
        
        int i = 0; int j =0;
        
        while(i < n1 && j < n2){
            if(arr1[i] < arr2[j]){
                if(size == 0 || union.get(size-1) != arr1[i]){
                    union.add(arr1[i]);
                }
                i++;
            }
            if(arr2[j] < arr1[i]){
                if(size == 0 || union.get(size-1) != arr2[j]){
                    union.add(arr2[j]);
                }
                j++;
            }
        }
        while(i < n1){
            if(size == 0 || union.get(size-1) != arr1[i]){
                    union.add(arr1[i]);
            }
            i++;
        }
        
        while(j < n2){
            if(size == 0 || union.get(size-1) != arr2[j]){
                    union.add(arr2[j]);
            }
            j++;
        }
        
        System.out.print("Union of the two arrays: ");
        for(int k = 0; k < union.size(); k++){
            System.out.print(union.get(k) + " ");
        }
        
    }

    public static void main(String[] args) {
        problem_union sol = new problem_union();
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};
        sol.Unionfunc(arr1, arr2);
    }
}
