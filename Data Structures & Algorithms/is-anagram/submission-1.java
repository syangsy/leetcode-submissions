class Solution {
    public boolean isAnagram(String s, String t) {

        // initialize an array representing positions to letters
        int[] alphabet = new int[26];

        if(s.length() != t.length())
            return false;

        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);
            int pos = curr - 'a';
            alphabet[pos]++;
        }

        for(int i = 0; i < t.length(); i++){
            char curr = t.charAt(i);
            int pos = curr - 'a';
            alphabet[pos]--;
        }

        for(int i = 0; i < alphabet.length; i++){
            if(alphabet[i] != 0)
                return false;
        }



        return true;
    }
}
