class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            HashSet<Character> set = new HashSet<>();
            for(int j=0;j<board.length;j++){
                char c = board[i][j];
                if(c!='.' && set.contains(c)){
                    return false;
                }
                if(c!='.') set.add(c);
            }  
        }
        for(int i=0;i<board.length;i++){
            HashSet<Character> set = new HashSet<>();
            for(int j=0;j<board.length;j++){
                char c = board[j][i];
                if(c!='.' && set.contains(c)){
                    return false;
                }
                if(c!='.') set.add(c);
            }  
        }
        
        for(int row=0;row<9;row+=3){
            for(int col=0;col<9;col+=3){ 
                HashSet<Character> set = new HashSet<>();
                for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        char c = board[i+row][j+col];
                        if(c!='.' && set.contains(c)){
                            return false;
                        }
                        if(c!='.') set.add(c);
                    }
                }
            }
        }
        return true;
    }
}