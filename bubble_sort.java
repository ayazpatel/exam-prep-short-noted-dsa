package com.ayafitech.mavenproject1;

public class bubble_sort {
    public static void main(String[] args) {
        int nums[] = {5,2,9,3,1};
        int size = nums.length;
        int temp = 0;
        
        System.out.println("Before Sorting");
        for (int i = 0; i < size; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        
        
        //sorting takes place
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size-i-1; j++) { // size -1
                if (nums[j] > nums[j+1]) {
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
            System.out.println("Sorting Iteration: " + i);
            for (int k = 0; k < size; k++) {
                System.out.print(nums[k] + " ");
            }
        }
        
        
        System.out.println("After Sorting");
        for (int i = 0; i < size; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
