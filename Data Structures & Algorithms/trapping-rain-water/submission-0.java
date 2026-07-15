class Solution {
    public int trap(int[] heights) {
        int lmax  = 0 ; 
        int rmax = 0 ;

        int total = 0 ; 

        int left =0 ;
        int right = heights.length-1; 

        while(left<right){
                if(heights[left]<heights[right]){
                        if(lmax>heights[left]){
                            total+=lmax-heights[left] ; 
                        }else{
                            lmax = heights[left] ; 
                        }
                        left=left+1 ; 
                }else{
                          if(rmax>heights[right]){
                            total+=rmax-heights[right] ; 
                        }else{
                            rmax = heights[right] ; 
                        }
                        right=right-1 ;
                }
        }
        return total ; 
    }
}
