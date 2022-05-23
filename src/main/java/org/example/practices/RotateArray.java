package org.example.practices;

public class RotateArray {

    public void rotate(int[] nums, int k) {

        k %= nums.length;

        int[] temp = new int[nums.length + k];

        for (int i = 0; i < nums.length; i++){
            temp[(i + k)%nums.length] = nums[i];
        }

        System.arraycopy(temp, 0, nums, 0, nums.length);

    }

}


