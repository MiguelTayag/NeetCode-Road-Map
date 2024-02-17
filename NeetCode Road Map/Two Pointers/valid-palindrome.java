// Miguel Tayag
// 02/17/2024
// Runtime: 2 ms Beats 99.13% of users with Java
// Memory: 42.61 MB Beats 90.33% of users with Java

class Solution {
    public boolean isPalindrome(String s) {
        // ------------------------------------------ OLD SOLUTION -------------------------------------
    //     String str = "";
    //     for(int i = 0; i < s.length(); i++){
    //         if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))){
    //             str += s.charAt(i);
    //         }
    //     }

    //     str = str.toLowerCase();
    //     int pointer1 = 0;
    //     int pointer2 = str.length() - 1;
    //     for(int i = 0; i < (int)(str.length() / 2); i++){
    //         if(str.charAt(pointer1) != str.charAt(pointer2)){
    //             return false;
    //         }
    //         pointer1++;
    //         pointer2--;
    //     }
    //     return true;
    // }

        // ------------------------------------------- NEW SOLUTION -----------------------------------
        int pointer1 = 0;
        int pointer2 = s.length() - 1;

        while(pointer1 < pointer2){
            if(!Character.isLetterOrDigit(s.charAt(pointer1))){
                pointer1++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(pointer2))){
                pointer2--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(pointer1)) != Character.toLowerCase(s.charAt(pointer2))){
                return false;
            }
            pointer1++;
            pointer2--;
        }
        return true;
    }
    
}