public class Main {
    public static void main(String[] args) {
        // Sample input
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        Solution solution = new Solution();
        int[] result = solution.twoSum(nums, target);

        // Output the result
        if (result != null) {
            System.out.println("[" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No solution found.");
        }
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int m = 0;

        while (true) {
            for (int i = m + 1; i < nums.length; i++) {
                int t = nums[m] + nums[i];
                if (t == target) {
                    return new int[] { m, i };
                }
            }
            m++;
        }
    }
}
