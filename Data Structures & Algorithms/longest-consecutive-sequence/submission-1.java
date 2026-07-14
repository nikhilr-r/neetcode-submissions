class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0 ; 
      /*  Arrays.sort(nums) ; 
       // use set instad of these 
        int count = 1  ;
        int maxcount = 1 ; 
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + 1 == nums[i + 1]) {
                count++; 
            } else if (nums[i] == nums[i + 1]) {
                continue; 
            } else {
                maxcount = Math.max(count, maxcount); 
                count = 1; 
            }
        }
        return Math.max(count, maxcount); 
        */

        // optimal one use hash set . 

        HashSet<Integer> set = new HashSet<>();

        int count = 1  ;
        int maxcount = 1 ; 

        for (int num : nums) {
            set.add(num);
        }

        for (int num : set) {
            // Hint applied: Check if 'num' is the START of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentCount = 1;

                // Step 3: Count upwards as long as the next consecutive numbers exist
                while (set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentCount += 1;
                }

                // Step 4: Update the maximum length found so far
                maxcount = Math.max(maxcount, currentCount);
            }
        }
        return maxcount; 
    }
}
