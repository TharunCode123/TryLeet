class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> has = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            int num = nums[i];
            int diff =  target - num;
            if(has.containsKey(diff)){
                return new int[]{has.get(diff),i};
            }
            has.put(num,i);
        }
        return new int[] {};
    }
}