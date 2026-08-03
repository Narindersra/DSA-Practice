// package Sorting;

// Problem Statement: Given an array of N integers, write a program to implement the Bubble Sorting algorithm.

public class problem_2 {
    void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i = n-1; i>=0; i--){
            boolean didswap = false;
            for(int j = 0;j<=i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didswap = true;
                }
            }
            if(didswap == false){
                break;
            }
        }
        
        for(int num: arr){
            System.out.print(num + " ");
            
        }
    }

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        problem_2 sol = new problem_2();
        sol.bubbleSort(arr);
    }
}
