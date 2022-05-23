package org.example.practices;

public class RemoveDuplicates {

    public int calculateRemovedDuplicatesVer(int[] nums) {

        int i = 0;
        int uniqueArrLength = 0;

        outerloop:
        while(i<nums.length){

            int j = 1;

            innerloop:
            while(i+j != nums.length && nums[i] == nums[i+j]){
                j++;
            }

            i += j;
            uniqueArrLength++;

        }

        return uniqueArrLength;

    }

    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) return 0;

        int i = 0;

        for (int j = 1; j < nums.length; j++) {

            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;

    }




}
