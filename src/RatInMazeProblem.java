import java.util.ArrayList;

public class RatInMazeProblem {
    static boolean isSafeToMove(int newX,int newY,int n,int[][] maze,boolean[][] visited){
        if(newX < 0 || newY < 0 || newX >= n || newY >= n){
            return false;
        } else if (maze[newX][newY] == 0) {
            return false;
        } else if (visited[newX][newY] == true) {
            return false;
        }
        else {
            return true;
        }
    }
    static void solve(int[][] maze,int srcX,int srcY,int destX,int destY,String path,boolean[][] visited,ArrayList<String> ans,int n){
        //base case
        if(srcX == destX && srcY == destY){
            ans.add(path);
            return;
        }
        visited[srcX][srcY] = true;
        //abi i have 4 options to move up,down,left,right
        //up
        int newX = srcX - 1;
        int newY = srcY;
        if(isSafeToMove(newX,newY,n,maze,visited)){
            solve(maze,newX,newY,destX,destY,path + "U",visited,ans,n);
        }
        //Down
        newX = srcX + 1;
        newY = srcY;
        if(isSafeToMove(newX,newY,n,maze,visited)){
            solve(maze,newX,newY,destX,destY,path + "D",visited,ans,n);
        }
        //left
        newX = srcX;
        newY = srcY - 1;
        if(isSafeToMove(newX,newY,n,maze,visited)){
            solve(maze,newX,newY,destX,destY,path + "L",visited,ans,n);
        }
        //right
        newX = srcX;
        newY = srcY + 1;
        if(isSafeToMove(newX,newY,n,maze,visited)){
            solve(maze,newX,newY,destX,destY,path + "R",visited,ans,n);
        }
        //kyuki aab meina 4 directions try kr li hai
        //aab muje wapis jana hai
        //Backtracking
        visited[srcX][srcY]=false;
    }
    public static ArrayList<String> ratInMaze(int[][] maze){
        ArrayList<String> ans = new ArrayList<>();
        int srcX = 0;
        int srcY = 0;
        int n = maze.length;
        int destX = n-1;
        int destY = n-1;
        String path = "";
        boolean[][] visited = new boolean[n][n];

        if(maze[0][0] == 0 || maze[n-1][n-1] == 0){
            return ans;
        }

        solve(maze,srcX,srcY,destX,destY,path,visited,ans,n);
        return ans;
    }
    public static void main(String[] args) {
        int[][] maze = {{1,0,0,0}, {1,1,0,0},{1,1,0,0},{0,1,1,1}};
        ArrayList<String> ans = ratInMaze(maze);
        System.out.println(ans);
    }
}
