class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> nums = new Stack<>();

        for(int i = 0; i < tokens.length; i++){
            if(tokens[i].equals("+")){
                int second = nums.pop();
                int first = nums.pop();

                int total = second+first;
                nums.push(total);

            }
            else if(tokens[i].equals("-")){
                int second = nums.pop();
                int first = nums.pop();

                int total = first-second;
                nums.push(total);
            }   
            else if(tokens[i].equals("*")){
                int second = nums.pop();
                int first = nums.pop();

                int total = first*second;
                nums.push(total);
            }
            else if(tokens[i].equals("/")){
                int second = nums.pop();
                int first = nums.pop();

                int total = first/second;
                nums.push(total);
            }
            else{
                int num = Integer.parseInt(tokens[i]);
                nums.push(num);
            }
        }
        
        return nums.pop();
  
        
    }
}
