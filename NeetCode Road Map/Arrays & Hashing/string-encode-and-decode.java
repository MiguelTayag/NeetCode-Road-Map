// Miguel Tayag
// 02/17/2024
// No Runtime and Memory comparison

class Solution {
    public String encode(List<String> strs) {
        String encodedString = "";
        for(int i = 0; i < strs.size(); i++){
            encodedString += strs.get(i).length() + "#" + strs.get(i);
        }
        return encodedString;
    }

    public List<String> decode(String str) {
        List<String> returnString = new ArrayList<>();
        int numberOfLetters = 0;
        String s = "";
        String numStr = "";
        for(int i = 0; i < str.length() - 1; i++){
            if(Character.isDigit(str.charAt(i))){
                numStr += str.charAt(i);
                i++;
                while(Character.isDigit(str.charAt(i))){
                    numStr += str.charAt(i);
                    i++;
                }
                if(str.charAt(i) == '#') {
                    i++;
                    numberOfLetters = Integer.parseInt(numStr);
                    if (i > str.length()) {
                        break;
                    }
                    for (int k = 0; k < numberOfLetters; k++) {
                        s += str.charAt(k + i);
                    }
                    i += numberOfLetters - 1;
                    returnString.add(s);
                    s = "";
                    numStr = "";
                }
            }
        }
        return returnString;
    }
}
