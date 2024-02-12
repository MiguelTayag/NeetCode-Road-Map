// Miguel Tayag
// 2/12/2024
// Runtime: 11 ms Beats 76.03% of users with Java
// Memory: 57.96 MB Beats 60.48% of users with Java

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }
}