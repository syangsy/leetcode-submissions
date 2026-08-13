class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> res = new HashMap<>();

        for(int i = 0; i < strs.length; i++){

            int[] keyEncode = new int[26];
            for(int j = 0; j < strs[i].length(); j++){
                char curr = strs[i].charAt(j);
                int pos = curr - 'a';
                keyEncode[pos]++;
            }

            String key = Arrays.toString(keyEncode);
            
            res.computeIfAbsent(key, k -> new ArrayList<String>()).add(strs[i]);

        }
    

        return new ArrayList<> (res.values());

    }
}
