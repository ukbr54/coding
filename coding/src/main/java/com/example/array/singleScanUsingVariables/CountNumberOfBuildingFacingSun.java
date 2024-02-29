package com.example.array.singleScanUsingVariables;

/**
 *  Given an input array height[] representing the heights of buildings, write a program to count the numbers
 *  of buildings facing the sunset. It is assumed that the heights of all the buildings are distinct
 *
 *  Ex- heights[] ={7,4,8,2,9} output=3
 *  -> As 7 is the first element, it can see the sunset. Similarly, 8 and 9 can see the sunset. 4 and 2 can't see
 *  the sunset because 7 and 8 are hiding it.
 */
public class CountNumberOfBuildingFacingSun {

    public static void main(String[] args) {
        int[] arr = {7, 4, 8, 2, 9};
        System.out.println("Building Facing sunset count: "+CountNumberOfBuildingFacingSun.facingSunCount(arr, arr.length));;
    }

    public static int facingSunCount(int height[],int n){
        int buildingCount = 1;
        int currMaxHeight = height[0];

        for (int i = 0; i < n; i++) {
            if(currMaxHeight < height[i]){
                currMaxHeight = height[i];
                buildingCount++;
            }
        }
        return buildingCount;
    }
}
