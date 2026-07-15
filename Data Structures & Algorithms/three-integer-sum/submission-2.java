class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
            
    List<List<Integer>> result = new ArrayList<>() ;
    Arrays.sort(nums);

    for (int i = 0; i < nums.length - 2; i++) {
        // 1. Skip duplicate for 'i' here like you did before
        if (i > 0 && nums[i] == nums[i - 1]) continue;

        // 2. Initialize your pointers
        int left = i + 1;
        int right = nums.length - 1;

        // 3. Slide the pointers to find the other two numbers
        while (left < right) {
            int currentSum = nums[i] + nums[left] + nums[right];

            if (currentSum == 0) {
                // Found it! Add to result.
                result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                // Move pointers and skip duplicates for left and right     
                left++;
                right--;
                // Skip duplicate values for the second element
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                 while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
            } else if (currentSum < 0) {
                left++; // Need a larger value
            } else {
                right--; // Need a smaller value
            }
        }
    }



/*      it brute force approach . tke the O(n3) Time Complexity and the Space Is 1 ;         for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate values for the first element
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < nums.length - 1; j++) {
                // Skip duplicate values for the second element
                // condition (j > i + 1) ensures we don't pick the same index
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                for (int k = j + 1; k < nums.length; k++) {
                    // Skip duplicate values for the third element
                    if (k > j + 1 && nums[k] == nums[k - 1]) {
                        continue;
                    }

                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> child = new ArrayList<>();
                        child.add(nums[i]);
                        child.add(nums[j]);
                        child.add(nums[k]);
                        result.add(child);
                    }
                }
            }
        }*/

        return result; 
    }
}
