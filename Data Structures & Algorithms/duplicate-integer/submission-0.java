class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){

            map.putIfAbsent(nums[i], 0);
            map.put(nums[i], map.get(nums[i])+1);

            if(map.get(nums[i]) > 1)
                return true;
            
        }

        return false;
    }
}