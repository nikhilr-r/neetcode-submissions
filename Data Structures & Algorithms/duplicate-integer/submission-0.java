class Solution {
    public boolean hasDuplicate(int[] nums) {
          // brute force solution 
/*
        Arrays.sort(nums) ; 

        for(int i=0;i<nums.length-1 ; i++){
            if(nums[i]==nums[i+1]){
                return true ; 
            }
        }
        return false ; 
*/
        // optiomal  use hashset for these so our time complexity will be the O(n) . 
        HashSet<Integer> copies = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(!copies.add(nums[i])){
                return true ;  
            }
        }
        return false  ; 
    }
}