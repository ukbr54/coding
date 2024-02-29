package com.example.array.singleScanUsingVariables;

public class ValidMountainArray {

    public static void main(String[] args) {
        int[] nums = {0,2,3,4,5,2,1,0};
        System.out.println(validMountainArray(nums, nums.length));
    }

    /**
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static boolean validMountainArray(int [] arr,int n){
        int climb = 0;

        // Find the peak of mountain
        while(climb<n-1 && arr[climb]<arr[climb+1]){
            climb = climb+1;
        }

        //Return false if the peak is at the beginning and end
        if(climb == 0 || climb == n-1){
            return false;
        }

        //Traverse down the mountain
        while(climb<n-1 && arr[climb]>arr[climb+1]){
            climb = climb + 1;
        }

        //Return true if the end of mountain is reached
        if(climb==n-1) return true;
        return false;
    }
}
