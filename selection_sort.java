package com.ayafitech.mavenproject1;

public class selection_sort {
    public static void main(String[] args) {
        int nums[] = {5,2,9,3,1};
        int size = nums.length;
        int temp = 0;
        int minIndex = -1;
        
        System.out.println("Before Sorting");
        for (int i = 0; i < size; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        
        
        //sorting takes place
        for (int i = 0; i < size-1; i++) {
            minIndex = i;
            for (int j = i+1; j < size; j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
                temp = nums[minIndex];
                nums[minIndex] = nums[i];
                nums[i] = temp;
            }
            System.out.println("Sorting Iteration: " + i);
            for (int k = 0; k < size; k++) {
                System.out.print(nums[k] + " ");
            }
        }
        
        
        System.out.println("\nAfter Sorting");
        for (int i = 0; i < size; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
