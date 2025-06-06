class Solution {
    public int[] twoSum(int[] nums, int target) {
        int j = nums.length - 1;
        int i = 0;
        while(i < j){
            int sum = nums[i] + nums[j];
            if (sum == target) {
                return new int[]{i + 1, j + 1};
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
       return new int[]{-1 , -1}; 
    }
}