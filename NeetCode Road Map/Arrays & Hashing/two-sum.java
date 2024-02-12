// Miguel Tayag
// 2/12/2024
// Runtime: 45 ms Beats 36.66% of users with Java
// Memory: 45.04 MB Beats 20.45% of users with Java

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int[] returnInt = new int[2];
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if((nums[i] + nums[j]) == target){
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }
}