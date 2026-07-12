class Solution {
    public boolean isAnagram(String s, String t) {
    
            if(s.length()!=t.length()) return false ; 

     /*       //brute force - take more time complexity n log n . 
            char[] s1 = s.toCharArray() ; 
            char[] s2 = t.toCharArray() ; 

            Arrays.sort(s1) ; 
            Arrays.sort(s2) ; 

            String t1 = new String(s1) ; 
            String t2 = new S
            tring(s2) ;

            if(t1.equalsIgnoreCase(t2)) {
                return true ; 
            }
            return false ; 
            */
        // optimal - > use char array . 

        int count[] = new int[26] ; 

        // do increamet at the s . 
        for(char c : s.toCharArray()){
            count[c-'a']++ ; 
        }

         // do decreament  at the t . 
        for(char c : t.toCharArray()){
            count[c-'a']-- ; 
        }

        //check for the 1 as those inc -> dec == 0 . if 1 found maens invalid 
        for(int i : count){
            if(i!=0) return false ; 
        }
        return true ; 
    }
}
