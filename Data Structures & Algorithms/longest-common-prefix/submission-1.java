class Solution {
    public String longestCommonPrefix(String[] strs) {

        
        String prefix = strs[strs.length-1];
        for(int i = strs.length-1; i >= 0; i--){

            if(strs[i].startsWith(prefix)){
                continue;
            }
            else{

                while(!strs[i].startsWith(prefix) && prefix.length() > 0){
                    prefix = prefix.substring(0, prefix.length()-1);

                }
            }
        }

        return prefix;

    }
}