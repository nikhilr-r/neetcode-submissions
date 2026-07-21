class Solution {
    public int search(int[] nums, int target) {

        int low = 0 ;
        int high = nums.length-1 ;

        while(low<=high){
            int mid = low + (high-low)/2 ;
            if(target > nums[mid] ){
                low = mid+1 ;
            }else if(target < nums[mid] ){
                high = mid - 1 ;
            }else{
                return mid ;
            }
        }
        return -1 ; 
    }
}
    /*    // Brute force take upto the O(n2) Time Complexity 
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return  i ; 
            }
        return -1 ;
        return -1 ; 
    }*/

