class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map <Integer, Integer> map = new HashMap <>();
        int[] ans = new int[2];

        for(int i = 0; i < nums.length; i++){

            int j = target - nums[i];

            if(map.containsKey(j)){
                ans[0] = map.get(j);
                ans[1] = i;
            }
            else{
                map.put(nums[i], i);
            }
        }
        return ans;
    }
}
