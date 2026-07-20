class Solution {
    public int largestRectangleArea(int[] heights) {

        if (heights == null || heights.length == 0) {
            return 0;
        }
        
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;
        
        // Loop through all bars plus one extra virtual bar (height 0) to clear the stack
        for (int i = 0; i <= n; i++) {
            // Use 0 as the height for the virtual boundary element past the end
            int currentHeight = (i == n) ? 0 : heights[i];
            
            // Maintain increasing order in the stack
            while (!stack.isEmpty() && heights[stack.peek()] > currentHeight) {
                int height = heights[stack.pop()];
                // If stack is empty, the width extends all the way to index 0
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }
        
        return maxArea;

        /*// these brute approach takes the O(n2) 
        int max = 0 ; 
        int len ; 
        int lmax = 0 ; 
        for(int i =0 ;i<heights.length;i++){
             int min = heights[i];
            for(int j=i;j<heights.length;j++){
                min = Math.min(min,heights[j]) ; 
                len = (j-i)+1 ;  
                max = len * min ;  
                lmax = Math.max(max,lmax) ; 
            }
        }
        return lmax ; */
    }
}
