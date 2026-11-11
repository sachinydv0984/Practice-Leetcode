import java.util.HashSet;

class Solution {
    public int firstMissingPositive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        // Store all numbers
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        // Check positive numbers starting from 1
        int num = 1;

        while (set.contains(num)) {
            num++;
        }

        return num;
    }
}