class Solution {
    public int[] productExceptSelf(int[] nums) {
        /* brute force takinh the o(n2) time complexity . 
        int product =1 ;  
        int result[] =  new int[nums.length] ; 
        for(int i=0;i<nums.length;i++){
            product = 1 ; 
           int  exclude = i ; 
            for(int j=0;j<nums.length;j++){
                if(j!=exclude){
                        product *= nums[j] ; 
                }
            }
            result[i] = product ; 
           
        }
        return result ; 
        */ 

        // optimal think about the prefix and suffix then combine them . 
        // go to -> right first . the left <- product . 

       int n= nums.length ; 
       int []answer = new int[n];
       answer[0] = 1 ; 

       for(int i=1;i<n;i++){
        answer[i] = answer[i-1]*nums[i-1] ;
       }
      
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * right; 
            right = right * nums[i];  
        }
        return answer;

    }
}  
