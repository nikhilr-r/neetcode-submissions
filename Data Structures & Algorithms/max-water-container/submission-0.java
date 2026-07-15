class Solution {
    public int maxArea(int[] heights) {
        int max  = 1 ; 
        int gmax = 0 ;

        int left =0 ;
        int right = heights.length-1; 

        while(left<right){
                 max = (Math.min(heights[left],heights[right])) * (right-left);
                 gmax = Math.max(max,gmax)  ; 
                 if(heights[left]<heights[right]){
                    left++ ; 
                 }else  right -- ; 
        }

        /* Brute Force These Will take The O(n2) Time Complexity . we ca noptimize it futher using the 2 pointer approach
        for(int i=0;i<heights.length;i++){
            for(int j=i+1;j<heights.length;j++){
                 max = (Math.min(heights[i],heights[j])) * (j-i);
                 gmax = Math.max(max,gmax) ; 
            }
        } */ 
        return gmax ; 
    }
}
