class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        

        int max = 0;
        for(int i = 0; i < piles.length; i++){
            max = Math.max(max, piles[i]);
        }

        /*
        // populate the array witht the possible k values
        int[] min = new int[max];
        for(int i = 0; i < min.length; i++){
            min[i] = i+1;
            System.out.println(min[i]);
        }
        */

        // binary search to find minimum k
        int l = 0;
        int r = max; // THIS WAS THE SECRET SAUCE
        int k = 0;

        while(l <= r){

            //System.out.println("l: " + l + " r: " + r);
            int mid = l + (r-l)/2;
            //System.out.println("mid: " + mid);

            // iterate thru piles to get bananas consumed with that k value
            int hours = 0;
            for(int i = 0; i < piles.length; i++){
                double m = mid;
                double time = Math.ceil(piles[i]/m);
                // System.out.println("curr: " + curr + "/" + m + " equals " + time);
                hours += time;
            }
            
            if(hours <= h){
                k = mid;
            }

            if(hours <= h){
                r = mid-1;
            }
            else if(hours > h){
                l = mid+1;
            }
            
        }

        return k;
        
    }
}
