import java.util.HashMap;

// Problem Statement: Given an array, we have found the number of occurrences of each element in the array.

public class problem_1 {
    public void countOccu(int arr[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        // System.out.println(map);
        for(Integer key : map.keySet()){
            System.out.println(key + " -> " + map.get(key));
        }

    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 10, 15, 10, 5};
        problem_1 sol = new problem_1();
        
        sol.countOccu(arr);
    }
}
