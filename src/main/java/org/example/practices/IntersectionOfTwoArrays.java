package org.example.practices;

import java.util.LinkedList;

public class IntersectionOfTwoArrays {

    public int[] intersect(int[] nums1, int[] nums2) {

        mergeSort(nums1);

        mergeSort(nums2);

        LinkedList<Integer> intersectList = new LinkedList<>();

        int k = 0;

        for(int i = 0, j = 0; i < nums1.length && j < nums2.length;){

            if(nums1[i] == nums2[j]){

                intersectList.add(nums1[i]);
                i++;
                j++;
            }

            else if(nums1[i] < nums2[j]){

                i++;
            }

            else {
                j++;
            }


        }

        return intersectList.stream().mapToInt(i -> i).toArray();

    }


    private void mergeSort(int[] nums){

        if(nums.length < 2){
            return;
        }

        int midIndex = nums.length / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[nums.length - midIndex];

        for(int i=0; i<midIndex; i++){
            leftHalf[i] = nums[i];
        }

        for(int i = midIndex; i < nums.length; i++){
            rightHalf[i - midIndex] = nums[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);


        merge(nums, leftHalf, rightHalf);



    }

    private void merge(int[] nums, int[] leftHalf, int[] rightHalf){

        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;

        while(i < leftSize && j < rightSize){

            if(leftHalf[i] <= rightHalf[j]){
                nums[k] = leftHalf[i];
                i++;
            }

            else {
                nums[k] = rightHalf[j];
                j++;
            }

            k++;
        }


        while(i < leftSize){
            nums[k] = leftHalf[i];
            i++;
            k++;
        }

        while(j < rightSize){
            nums[k] = rightHalf[j];
            j++;
            k++;
        }
    }
}
