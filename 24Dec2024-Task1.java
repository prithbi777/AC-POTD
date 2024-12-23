/*
Author: Prithbiraj Mahanta
Date: 24-12-2024
TaskNo: 1
Platform: Leetcode
Problem: 75

*/

//THIS ALGORITHM IS CALLED DUTCH NATIONAL FLAG ALGORITHM
class Solution {
    public void sortColors(int[] nums) {
        int start = 0, mid = 0, end = nums.length-1;
        while(mid<=end){
            if(nums[mid]==0){
                int temp = nums[mid];
                nums[mid] = nums[start];
                nums[start] = temp;
                mid++;
                start++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                int temp = nums[mid];
                nums[mid] = nums[end];
                nums[end] = temp;
                end--;
            }
        }
        
       
    }
}
