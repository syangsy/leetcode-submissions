class Solution {

    public String encode(List<String> strs) {
        String res = "";
        for(int i = 0; i < strs.size(); i++){
            res = res + strs.get(i).length() + "#" +  strs.get(i);
            // System.out.println(res);
        }
        return res;
    }

    public List<String> decode(String str) {
        ArrayList<String> decode = new ArrayList<>();

        int i = 0;
        while(i < str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int len = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            // System.out.println(str.charAt(i));
            // System.out.println("i: " + i + " len: " + len);
            String addition = str.substring(i, i+len);
            decode.add(addition);
            i = i + len;
            // I AM ASSUMING THAT EVERY STRING IS < 10
        }
   
        return decode;
    }

}
