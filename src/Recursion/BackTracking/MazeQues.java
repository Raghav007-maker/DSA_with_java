package Recursion.BackTracking;

import java.util.ArrayList;
import java.util.Arrays;

public class MazeQues {

    public static void main(String[] args) {
        // System.out.println(maze(3,3));
        // path("",3,3);
        // ArrayList<String> list=pathList("",3,3);
        // System.out.println(list);
        // ArrayList<String> list2=pathwithDiagonal("",3,3);
        // System.out.println(list2);

        boolean[][] board = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };
        // pathrestriction("", board, 0, 0);
        AllPath("", board, 0, 0);
        // int[][] path=new int[board.length][board[0].length];
        // AllPathPrint("", board, 0, 0,path,1);
    }

    public static int maze(int row, int col) {
        if (row == 1 || col == 1) {
            return 1;
        }

        int left = maze(row - 1, col);
        int right = maze(row, col - 1);
        return left + right;
    }

    public static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r > 1) {
            path(p + 'D', r - 1, c);
        }
        if (c > 1) {
            path(p + 'R', r, c - 1);
        }
    }

    public static ArrayList<String> pathList(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1) {
            list.addAll(pathList(p + 'D', r - 1, c));
        }
        if (c > 1) {
            list.addAll(pathList(p + 'R', r, c - 1));
        }
        return list;
    }

    public static ArrayList<String> pathwithDiagonal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1 && c > 1) {
            list.addAll(pathwithDiagonal(p + 'D', r - 1, c - 1));
        }
        if (r > 1) {
            list.addAll(pathwithDiagonal(p + 'V', r - 1, c));
        }
        if (c > 1) {
            list.addAll(pathwithDiagonal(p + 'H', r, c - 1));
        }
        return list;
    }

    // maze with restrictions
    public static void pathrestriction(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (maze[r][c] == false) {
            return;
        }
        if (r < maze.length - 1) {
            pathrestriction(p + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            pathrestriction(p + 'R', maze, r, c + 1);
        }
    }

    public static void AllPath(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (maze[r][c] == false) {
            return;
        }
        maze[r][c] = false;
        if (r < maze.length - 1) {
            AllPath(p + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            AllPath(p + 'R', maze, r, c + 1);
        }

        if (r > 0) {
            AllPath(p + 'U', maze, r - 1, c);

        }
        if (c > 0) {
            AllPath(p + 'L', maze, r, c - 1);
        }
        // this line is where th efunction will be over
        // so before the function gets removed, also removed the changes that were made by that function
        maze[r][c] = true;
    }
    public static void AllPathPrint(String p, boolean[][] maze, int r, int c,int[][] path,int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            for(int[] arr:path){
                path[r][c]=step;
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if (maze[r][c] == false) {
            return;
        }
        maze[r][c] = false;
        path[r][c]=step;
        if (r < maze.length - 1) {
            AllPathPrint(p + 'D', maze, r + 1, c,path,step+1);
        }
        if (c < maze[0].length - 1) {
            AllPathPrint(p + 'R', maze, r, c + 1,path,step+1);
        }

        if (r > 0) {
            AllPathPrint(p + 'U', maze, r - 1, c,path,step+1);

        }
        if (c > 0) {
            AllPathPrint(p + 'L', maze, r, c - 1,path,step+1);
        }
        // this line is where th efunction will be over
        // so before the function gets removed, also removed the changes that were made by that function
        maze[r][c] = true;
        path[r][c]=0;
    }

}
