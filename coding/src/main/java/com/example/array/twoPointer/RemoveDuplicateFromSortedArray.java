package com.example.array.twoPointer;

/**
 *  Pointers are moving in the same direction at a different pace (Fast and slow pointers)
 *
 *  Time complexity - O(n)
 *  Space Complexity - O(1)
 */
public class RemoveDuplicateFromSortedArray {

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] arr){
        int n = arr.length;
        int slow = 0;
        int fast = 1;
        while(fast < n){
            if(arr[slow] != arr[fast]){
                slow = slow + 1;
                arr[slow] = arr[fast];
            }
            fast = fast + 1;
        }
        return slow + 1;
    }
}
