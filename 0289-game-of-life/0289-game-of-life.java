class Solution {
    public void gameOfLife(int[][] board) {
        int [] dx = {-1,-1,-1,0,0,1,1,1};
        int [] dy = {-1,0,1,-1,1,-1,0,1};

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                int liveNeighbours = 0;
                for(int k=0;k<8;k++){
                    int x = i+ dx[k];
                    int y = j+dy[k];
                    if(isValidNeighbour(x,y,board) && Math.abs(board[x][y])==1){
                        liveNeighbours++;
                    }
                }

                if(board[i][j]==1 && (liveNeighbours<2 || liveNeighbours>3)){
                    board[i][j]=-1;
                }
                if(board[i][j]==0 && liveNeighbours==3){
                    board[i][j]=2;
                }
            }
        }

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]>=1) {
                    board[i][j]=1;
                }
                else{
                    board[i][j]=0;
                }
            }
        }

    }

    public boolean isValidNeighbour(int x,int y,int[][] board){
        return (x>=0 && x<board.length && y>=0 && y< board[0].length);
    }
}