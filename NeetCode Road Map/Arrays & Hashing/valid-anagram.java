// Miguel Tayag
// 2/12/2024
// Runtime: 2 ms Beats 97.03% of users with Java
// Memory: 43.22 MB Beats 66.17% of users with Java


class Solution {
    public boolean isAnagram(String s, String t) { 
        // if(s.length() != t.length()){
        //     return false;
        // }
        int[] arr1 = new int[26];
        // int[] arr2 = new int[26];

        for(char sCh: s.toCharArray()){
            arr1[sCh - 'a'] += 1;
            // arr1[t.charAt(i) - 'a'] -= 1; 
        }
        for(char tCh: t.toCharArray()){
            // arr1[s.charAt(i) - 'a'] += 1;
            arr1[tCh - 'a'] -= 1; 
        }
        for(int i = 0; i < arr1.length; i++){
            // System.out.println(i + " : " + arr1[i]);
            if(arr1[i] != 0){
                return false;
            }
        }
        return true;
    }
}