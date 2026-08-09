class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        Set<Integer> dups = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            if(!dups.add(nums[i]))
                return true;
        }

        return false;
    }
}