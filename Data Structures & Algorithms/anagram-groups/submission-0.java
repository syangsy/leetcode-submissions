class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> anagrams = new ArrayList<>();
        Map <String, ArrayList<String>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            int[] abc = new int[26];
            for(int j = 0; j < strs[i].length(); j++){
                int loc = strs[i].charAt(j) - 'a';
                abc[loc]++;
            }

            String code = Arrays.toString(abc);
            if(map.containsKey(code)){
                map.get(code).add(strs[i]);
            }
            else{
                ArrayList<String> list = new ArrayList<String>();
                list.add(strs[i]);
                map.put(code, list);
            }
        }

        for(String key : map.keySet()){
            anagrams.add(map.get(key));
        }

        return anagrams;

    }
}
