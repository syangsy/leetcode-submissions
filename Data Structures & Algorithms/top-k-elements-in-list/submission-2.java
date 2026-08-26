class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> freq = new HashMap<>();
        List <Integer>[] buckets = new List[nums.length+1];

        for(int i = 0; i < nums.length; i++){
            freq.put(nums[i], freq.getOrDefault(nums[i], 0)+1);
        }
        
        for(int i = 0; i < buckets.length; i++){
            buckets[i] = new ArrayList<>();
        }

        for(Integer key : freq.keySet()){
            buckets[freq.get(key)].add(key);
        }

        int[] res = new int[k];
        int index = 0;
        for(int i = buckets.length-1; i >= 0; i--){
            for(int num : buckets[i]){
                res[index] = num;
                index++;
                if(index >= k){
                    return res;
                }
             }
        }

        return res;

    }
}
