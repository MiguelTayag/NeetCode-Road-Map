// Miguel Tayag
// 02/18/2024
// Runtime: 2 ms Beats 94.23% of users with Java
// Memory: 47.19 MB Beats 42.82% of users with Java


class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int pointer1 = 0;
        int pointer2 = numbers.length - 1;

        while(pointer1 < pointer2){
            if(numbers[pointer1] + numbers[pointer2] > target){
                pointer2--;
            }else if(numbers[pointer1] + numbers[pointer2] < target){
                pointer1++;
            }else{
                return new int[]{pointer1 + 1, pointer2 + 1};
            }
        }
        return null;
    }
}