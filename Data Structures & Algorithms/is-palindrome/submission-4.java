class Solution {
    public boolean isPalindrome(String s) {


        // s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        s = s.toLowerCase();
        int start = 0;
        int end = s.length()-1;

        while(start < end){

            while(!Character.isLetterOrDigit(s.charAt(start)) && start < end){
                start++;
            }

            while(!Character.isLetterOrDigit(s.charAt(end)) && start < end){
                end--;
            }

        
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }

        return true;  
    }
}
