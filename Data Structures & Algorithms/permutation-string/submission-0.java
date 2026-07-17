class Solution {
    public boolean checkInclusion(String s1, String s2) {
         if (s1.length() > s2.length()) return false;

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        // 1. Fill s1Count and initialize the very first window in s2Count
        for (int i = 0; i < s1.length(); i++) {
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }

        // 2. Check if the initial window is already a match
        if (matches(s1Count, s2Count)) return true;

        // 3. Slide the window across s2
        int k = s1.length();
        for (int right = k; right < s2.length(); right++) {
            // Add the new character entering the window on the right
            s2Count[s2.charAt(right) - 'a']++;
            
            // Remove the old character leaving the window on the left
            int left = right - k;
            s2Count[s2.charAt(left) - 'a']--;

            // Check if the modified window matches
            if (matches(s1Count, s2Count)) return true;
        }

        return false;
    }

    // Helper method to compare arrays (takes constant O(1) time because size is always 26)
    private boolean matches(int[] arr1, int[] arr2) {
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }
}