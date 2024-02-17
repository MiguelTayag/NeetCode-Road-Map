// Miguel Tayag
// 02/16/2024
// Runtime: 12 ms Beats 34.38% of users with Java
// Memory: 44.17 MB Beats 82.18% of users with Java


class Solution {
    public boolean isValidSudoku(char[][] board) {
        ArrayList<Character> list = new ArrayList<>();
        ArrayList<Character> list1 = new ArrayList<>();
        // checking for 3x3
        for(int j = 0; j < board.length; j+=3){
            for(int k = 0; k < board.length; k++){
                for(int x = 0; x < 3; x++){
                    if(board[k][x + j] != '.'){
                        if(list.contains(board[k][x + j])){
                            // System.out.println("3x3 false on " + k + " " + (x + j));
                            return false;
                        }else{
                            list.add(board[k][x + j]);
                        }
                    }
                    
                }
                k++;
                for(int x = 0; x < 3; x++){
                    if(board[k][x + j] != '.'){
                        if(list.contains(board[k][x + j])){
                            // System.out.println("3x3 false on " + k + " " + (x + j));
                            return false;
                        }else{
                            list.add(board[k][x + j]);
                        }
                    }
                    
                }
                k++;
                for(int x = 0; x < 3; x++){
                    if(board[k][x + j] != '.'){
                        if(list.contains(board[k][x + j])){
                            // System.out.println("3x3 false on " + k + " " + (x + j));
                            return false;
                        }else{
                            list.add(board[k][x + j]);
                        }
                    }
                }
                System.out.println(list.toString());
                list = new ArrayList<>();
            }
        }
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                if(board[i][j] != '.'){
                    if(list.contains(board[i][j])){
                        // System.out.println(list.toString());
                        // System.out.println("ij false on " + i + " " + j);
                        return false;
                    }else{
                        list.add(board[i][j]);
                    }
                }
                if(board[j][i] != '.'){
                    if(list1.contains(board[j][i])){
                        // System.out.println(list1.toString());
                        // System.out.println("ji false on " + i + " " + j);
                        return false;
                    }else{
                        list1.add(board[j][i]);
                    }
                }
            }
            list = new ArrayList<>();
            list1 = new ArrayList<>();
        }
        return true;
    }
}