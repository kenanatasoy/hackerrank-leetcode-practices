package org.example.practices;

public class MoveZeroes {

    public void moveZeroes(int[] nums) {

        for(int i = 0, j = 1; i < nums.length - 1 && j < nums.length;){

            if(nums[i] == 0 && nums[j] == 0){
                j++;
                continue;
            }

            if(nums[i] != 0 && nums[j] == 0){
                i++;
                j++;
                continue;
            }

            if(nums[i] == 0 && nums[j] != 0){
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                i++;
                j++;
                continue;
            }

            if(nums[i] != 0 && nums[j] != 0){
                i++;
                j++;
            }

        }

    }
}
