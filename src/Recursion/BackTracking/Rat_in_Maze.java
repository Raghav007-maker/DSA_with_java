package Recursion.BackTracking;

import java.util.ArrayList;
import java.util.Collections;

public class Rat_in_Maze {
    public ArrayList<String> ratInMaze(int[][] maze) {
        int m = maze.length;
        int n = m;

        ArrayList<String> list = new ArrayList<>();
        helper(maze, list, "", 0, 0, m, n);
        Collections.sort(list);
        return list;
    }

    public void helper(int[][] maze, ArrayList<String> list, String str, int i, int j, int m, int n){

        if(i < 0 || i >= m || j < 0 || j >= n || maze[i][j] != 1) {
            return;
        }

        if(i == m - 1 && j == n - 1){
            list.add(str);
            return;
        }

        maze[i][j] = 0;

        helper(maze, list, str + "L", i, j - 1, m, n);
        helper(maze, list, str + "R", i, j + 1, m, n);
        helper(maze, list, str + "D", i + 1, j, m, n);
        helper(maze, list, str + "U", i - 1, j, m, n);

        maze[i][j] = 1;

        return;
    }
}
