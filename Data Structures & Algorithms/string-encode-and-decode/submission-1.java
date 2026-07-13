class Solution {

    public String encode(List<String> strs) {
         if (strs == null || strs.isEmpty()) return "";
        
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            // Append length + delimiter + string content
            sb.append(str.length()).append("#").append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        if (s == null || s.isEmpty()) return result;

        int i = 0;
        while (i < s.length()) {
            // Find the index of the structural delimiter '#'
            int delimiterIdx = s.indexOf('#', i);
            
            // Extract the length prefix and advance past the delimiter
            int length = Integer.parseInt(s.substring(i, delimiterIdx));
            i = delimiterIdx + 1;
            
            // Extract the exact substring using the length boundaries
            String str = s.substring(i, i + length);
            result.add(str);
            
            // Move pointer to the start of the next sequence
            i += length;
        }
        return result;
    }
}
