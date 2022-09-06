import java.util.ArrayList;;

public class App {

    static ArrayList<String> solve(int [][]maze, int n, int currRow, int currCol){
        ArrayList<String> finalList = new ArrayList<>();
        
        if(currRow == n-1 && currCol == n-1){
            finalList.add("");
            return finalList;
        }
        
        if(currRow == n || currCol == n || currRow < 0 || currCol < 0 || maze[currRow][currCol] == 0){
            return finalList;
        }
        
        int t = maze[currRow][currCol];
        maze[currRow][currCol] = 0;
        
            ArrayList<String> dresult = solve(maze, n, currRow + 1, currCol); 
            for(String str: dresult){
                finalList.add("D" + str);
            }
            ArrayList<String> rresult = solve(maze, n, currRow, currCol + 1);
            for(String str: rresult){
                finalList.add("R" + str);
            }

            ArrayList<String> uresult = solve(maze, n, currRow - 1, currCol);
            for(String str: uresult){
                finalList.add("U" + str);
            }
            ArrayList<String> lresult = solve(maze, n, currRow, currCol - 1);
            for(String str: lresult){
                finalList.add("L" + str);
            }
        maze[currRow][currCol] = t;
        return finalList;
     }
     
     public static ArrayList<String> findPath(int[][] maze, int n) {
         if(maze[n-1][n-1] == 0){
             ArrayList<String> list = new ArrayList<>();
             list.add("-1");
             return list;
         }
         return solve(maze, n, 0, 0);
     }

    public static void main(String[] args) throws Exception {
        int m[][] = {
                { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 1, 1, 0, 0 },
                { 0, 1, 1, 1 }
        };
        int n = m.length;
        ArrayList<String> result = findPath(m, n);
        System.out.println(result);
    }
}
