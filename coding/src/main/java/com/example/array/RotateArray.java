package com.example.array;

import java.util.Arrays;

/**
 * Example 1:
 *
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 *
 *
 * Could you do it in-place with O(1) extra space?
 */
public class RotateArray {

    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7};
        int [] nums1 = {1,2,3,4,5,6,7};
        int [] nums3 = {1,2,3,4,5,6,7};
        rotateLeft(nums,3);
        rotateRight(nums1,3);
        rotateArrayRightUsingSpace(nums3,3);
    }

    /**
     * Time Complexity: O(n)
     *
     * Space Complexity: O(k) since k array element needs to be stored in temp array
     */
    public static void rotateArrayRightUsingSpace(int[] arr, int k){
        int n = arr.length;
        int[] temp = new int[k];

        for(int i=0; i<k; i++){
            temp[i] = arr[i];
        }

        for(int i=0; i<n-k; i++){
            arr[i] = arr[i+k];
        }

        for(int i=n-k; i<n; i++){
            arr[i] = temp[i-n+k];
        }

        System.out.println("Rotate the elements of array to the left by "+k+" places "+ Arrays.toString(arr));
    }

    /**
     *
     * Time Complexity:
     * O(K * N) — where k is number of shifting to be performed and N is number of elements in the array
     *
     * Space Complexity:
     * O(1) — as the shifting is performed In-Place
     */
    public static void rotateLeft(int[] arr, int k){
        int rotate = k;
        int size = arr.length;
        k = k % size; //eg -> k=9 then 9%7 = 2

        while(k-- != 0){
           int pick = arr[0];
           for(int i=1; i<size; i++){
               arr[i-1] = arr[i];
           }
           arr[size-1] = pick;
        }

        System.out.println("Rotate the elements of array to the left by "+rotate+" places "+ Arrays.toString(arr));
    }

    public static void rotateRight(int[] arr, int k){
        int rotate = k;
        int size = arr.length;
        k = k % size; //eg -> k=9 then 9%7 = 2

        while(k-- != 0){
            int pick = arr[size-1];
            for(int i=size-1; i>0; i--){
                arr[i] = arr[i-1];
            }
            arr[0] = pick;
        }
        System.out.println("Rotate the elements of array to the right by "+rotate+" places "+ Arrays.toString(arr));
    }
}
