// package Hashing;

import java.util.HashMap;

// Problem Statement: Problem Statement: Given an array of size N. Find the highest and lowest frequency element.


// ------------------------------Optimal Approach------------------------------
public class problem_2 {
    public void countOccu(int arr[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        // System.out.println(map);
        int maxFreq = 0 , minFreq = arr.length;
        int maxEle = 0, minEle = 0;
        for(Integer key : map.keySet()){
            int freq = map.get(key);
            if(freq > maxFreq){
                maxFreq = freq;
                maxEle = key;
            }
            if(freq < minFreq){
                minFreq = freq;
                minEle = key;
            }
        }
        System.out.print(maxEle + " " + minEle);
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 10, 15, 10, 5};
        problem_2 sol = new problem_2();
        
        sol.countOccu(arr);
    }
}

// ------------------------------Brute Force Approach------------------------------
// public class problem_2 {
//     public void countOccu(int arr[]){
//         int n  = arr.length;
//         boolean[] visited = new boolean[n];
//         int maxFreq = 0 , minFreq = n;
//         int maxEle = 0, minEle = 0;
        
//         for(int i = 0; i<n; i++){
//             if(visited[i]){
//                 continue;
//             }
//             int count = 1;
//             for(int j =i+1; j < n;j++){
//                 if(arr[i] == arr[j]){
//                     visited[i] = true;
//                     count++;
//                 }
//             }
//             if(count > maxFreq){
//                 maxEle = arr[i];
//                 maxFreq = count;
//             }
//             if (count < minFreq) {
//                 minEle = arr[i];
//                 minFreq = count;
//             }
//         }
//         System.out.print(maxEle + " " + minEle);

//     }
//     public static void main(String[] args) {
//         int[] arr = {10, 5, 10, 15, 10, 5};
//         problem_1 sol = new problem_1();
        
//         sol.countOccu(arr);
//     }
// }
