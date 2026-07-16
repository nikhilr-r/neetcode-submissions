class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Brute Force .  Takes the O(n ) time and the O(n) space   . 
        int count = 0 ;
        int maxc =0 ;

        HashSet<Character> set = new HashSet<>() ;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i) ; 
            if(set.contains(ch)){
                    i = s.indexOf(ch,i-count) ; 
                    set.clear();
                    count = 0 ;
            }else{
                set.add(ch) ; 
                count++ ; 
            }
            maxc = Math.max(maxc,count) ; 
        }
        return maxc ; 
    }
}
