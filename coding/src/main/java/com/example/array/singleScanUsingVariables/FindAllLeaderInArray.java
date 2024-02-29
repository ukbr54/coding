package com.example.array.singleScanUsingVariables;

/**
 *  Given an integer array X[] of size n, write a program to find all the leaders in the array X[].
 *  An element is a leader if it is strictly greater than all the elements to its right side.
 *
 *  Example 1: X[] = {16,17,4,3,5,2} Output: {7,5,2}
 *  Explanation: Element 2 is the rightmost element, so it is a leader by default.
 *  17 and 5 are also leader elements because they are greater than all the elements on their right side.
 *
 *  Time Complexity: O(n)
 * Auxiliary Space: O(1)
 */
public class FindAllLeaderInArray {

    public static void main(String[] args) {
        int X[] = {16,17,4,3,5,2};
        printLeaders(X,X.length);
    }

    public static void printLeaders(int[] arr, int n){
        int rightFromMax = arr[n-1];
        System.out.print(rightFromMax + " ");
        for(int i=n-2; i>0; i--){
            if(arr[i] > rightFromMax){
                rightFromMax = arr[i];
                System.out.print(rightFromMax + " ");
            }
        }
    }
}
