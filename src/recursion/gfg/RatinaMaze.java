package recursion.gfg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class RatinaMaze {
    static boolean isSafe(int newX,int newY,int n,
                          int[][] maze,boolean[][] visited){

        if (newX < 0 || newX >= n || newY < 0 || newY >= n){
            return false;
        }
        else if (maze[newX][newY] == 0) {
            return false;
        }
        else if (visited[newX][newY]) {
            return false;
        }
        else {
            return true;
        }
    }

    static void solve(int[][] maze,int n,int srcX,int srcY,int destX,int destY,
                      boolean[][] visited, List<String> ans,String path){

        if(srcX == destX && srcY == destY){
            ans.add(path);
            return;
        }

        visited[srcX][srcY] = true;

        // up
        int newX = srcX - 1;
        int newY = srcY;

        if (isSafe(newX,newY,n,maze,visited)){
            solve(maze, n, newX, newY, destX, destY, visited, ans, path+"U");
        }

        // down
        newX = srcX + 1;
        newY = srcY;

        if (isSafe(newX,newY,n,maze,visited)){
            solve(maze, n, newX, newY, destX, destY, visited, ans, path+"D");
        }

        // left
        newX = srcX ;
        newY = srcY - 1;

        if (isSafe(newX,newY,n,maze,visited)){
            solve(maze, n, newX, newY, destX, destY, visited, ans, path+"L");
        }

        // right
        newX = srcX;
        newY = srcY + 1;

        if (isSafe(newX,newY,n,maze,visited)){
            solve(maze, n, newX, newY, destX, destY, visited, ans, path+"R");
        }

        visited[srcX][srcY] = false;

    }

    public static ArrayList<String> ratInMaze(int[][] maze) {

        int srcX = 0;
        int srcY = 0;

        int n = maze.length;
        int destX = n - 1;
        int destY = n - 1;

        boolean [][]visited = new boolean[n][n];
        ArrayList<String> ans = new ArrayList<>();
        String path = "";

        if(maze[srcX][srcY] == 0 || maze[destX][destY] == 0){
            return ans;
        }

        solve(maze,n,srcX,srcY,destX,destY,visited,ans,path);

        Collections.sort(ans);

        return ans;

    }
    public static void main(String[] args) {
//        int[][] maze = {
//                {1, 0, 0, 0},
//                {1, 1, 0, 1},
//                {1, 1, 0, 0},
//                {0, 1, 1, 1}
//        };

        int[][] maze = {
                {1, 1, 1, 0, 1},
                {1, 0, 1, 1, 1},
                {0, 0, 1, 1, 1},
                {1, 0, 0, 1, 1},
                {1, 0, 0, 0, 1}
        };

//        int[][] maze = {
//                {1, 1},
//                {0, 1}
//        };

        List<String> ans = ratInMaze(maze);

        System.out.println(ans);

    }
}
