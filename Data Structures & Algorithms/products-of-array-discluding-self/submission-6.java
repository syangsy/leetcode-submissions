class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] prods = new int[nums.length];
        // int[] right = new int[nums.length];


        // prefix 
        prods[0] = 1;
        for(int i = 1; i < nums.length; i++){
            prods[i] = prods[i-1] * nums[i-1];
        }

        //postfix
        int rightProd = 1;
        for(int i = prods.length-1; i >= 0; i--){
            prods[i] = prods[i] * rightProd;
            rightProd *= nums[i];
        }


        return prods;
    }
}  
