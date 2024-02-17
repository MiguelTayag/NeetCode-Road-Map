class Solution {
    public int longestConsecutive(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        if(nums.length == 0){
            return 0;
        }
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }

        int maxCounter = 1;
        int currentCounter = 1;
        int pastNum = Integer.MIN_VALUE;

        System.out.println(set.toString());

        for (int number : set) {
            if(pastNum == Integer.MIN_VALUE){
                pastNum = number;
                continue;
            }
            if(number == (pastNum + 1)){
                currentCounter += 1;
                pastNum = number;
                if(currentCounter > maxCounter){
                    maxCounter = currentCounter;
                }
            }else{
                currentCounter = 1;
                pastNum = number;
            }
        }
        return maxCounter;
    }
}