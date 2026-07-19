class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

       Stack<Integer> st = new Stack<>() ; 
        int[] result  = new int[temperatures.length] ; 
        for(int i =temperatures.length-1; i>=0;i--){
            while(!st.empty() && temperatures[st.peek()] <= temperatures[i]){
                    st.pop(); 
            }
            if(!st.empty()){
                result[i] = st.peek()- i   ; 
            }else {         
                result[i] = 0  ; 
            }
            st.push(i) ; 
        }  
        /* Brute Approach  
        /* These is the vrute force it takes the O(n2) TC . and O(n) SC . 

        for(int i=0;i<temperatures.length-1;i++){
            count = 1 ;
            for(int j=i+1;j<temperatures.length;j++){
                if(temperatures[i] < temperatures[j]){
                   result[i] = count ; 
                   break ; 
                }else{
                    count ++ ; 
                }
            }
        }*/
        return result ; 
    }
}
