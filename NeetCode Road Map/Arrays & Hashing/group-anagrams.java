// Miguel Tayag
// 2/12/2024
// Runtime: 7 ms Beats 63.25% of users with Java
// Memory 47.85 MB Beats 33.39% of users with Java

import java.util.ArrayList;  
import java.util.List; 

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> outer = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        List<String> inner;
        for(int i = 0; i < strs.length; i++){
            inner = new ArrayList<>();
            char[] sortedChar = strs[i].toCharArray();

            Arrays.sort(sortedChar);
            String scStr = String.valueOf(sortedChar);

            if(map.size() > 0){
                if(map.containsKey(scStr)){
                    inner = map.get(scStr);
                    inner.add(strs[i]);
                    map.put(scStr, inner);
                }else{
                    inner.add(strs[i]);
                    map.put(scStr, inner);
                }
            }else{
                inner.add(strs[i]);
                map.put(scStr, inner);
            }
        }
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            outer.add(entry.getValue());
        }
        return outer;
    }
}