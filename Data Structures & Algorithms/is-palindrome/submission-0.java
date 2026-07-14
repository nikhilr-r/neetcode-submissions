class Solution {
    public boolean isPalindrome(String s) {

        String result =  s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        int high = result.length()-1 ; 
        int low = 0 ; 

        while(low<high){
            if(result.charAt(low)!=result.charAt(high)){
                return false ; 
            }
            low++ ; 
            high-- ; 
        }
        return true ; 
    }
}
