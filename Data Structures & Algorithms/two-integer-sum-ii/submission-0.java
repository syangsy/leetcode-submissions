class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int index1 = 0;
        int index2 = numbers.length-1;

        while(index1 < index2 && numbers[index1] + numbers[index2] != target){
            
            
            if(numbers[index1] + numbers[index2] > target){
                index2--;
            }
            else{
                index1++;
            }
        }
        index1++;
        index2++;

        return new int[] {index1, index2};


    }
}
