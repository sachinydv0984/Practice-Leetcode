import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        // Step 1: Insert all elements into HashSet
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        // Step 2: Traverse the HashSet
        for (int num : set) {

            // Step 3: Find the starting point
            if (!set.contains(num - 1)) {

                int count = 1;
                int currentNum = num;

                // Step 4: Count consecutive numbers
                while (set.contains(currentNum + 1)) {

                    currentNum++;
                    count++;
                }

                // Step 5: Update maximum length
                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}