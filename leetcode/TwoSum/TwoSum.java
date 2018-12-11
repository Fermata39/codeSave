class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sum = {};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {

                    sum = new int[]{i, j};
                    break;
                }
            }
        }
        return sum;
    }
}
