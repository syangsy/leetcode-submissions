class Solution {
    public int lengthOfLongestSubstring(String s) {

        int pointer = 0;
        Set<Character> seen = new HashSet<>();
        int max = 0;

        for(int i = 0; i < s.length(); i++){

            char curr = s.charAt(i);

            while(seen.contains(curr)){
                seen.remove(s.charAt(pointer));
                pointer++;

            }
    
            seen.add(curr);
            max = Math.max(max, i - pointer+1);
        }




        return max;


    }
}
