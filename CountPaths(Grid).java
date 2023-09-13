import java.util.List;
import java.util.HashMap;

class Source {
  public static int countPaths(List<List<String>> grid)
  {
    return countPaths(0,0,grid , new HashMap<>());
  }
  public static int countPaths(int rows , int columns , List<List<String>> grid , HashMap<List<Integer> , Integer> memo) { // List<Integer> to represent a collective of rows and columns
    if(rows == grid.size() || columns == grid.get(0).size()) //Out of bounds problem
    return 0;

    if(grid.get(rows).get(columns) == "X") //wall
    return 0;
        
    if(rows == grid.size() - 1 && columns == grid.get(0).size() - 1) //base case
    return 1;
    
    List<Integer> pos = List.of(rows,columns);
    if(memo.containsKey(pos))
    {
      return memo.get(pos);
    }
    

    int result =  countPaths(rows = 1 , columns , grid, memo) + countPaths(rows , columns = 1 , grid , memo);
    memo.put(pos,result);
    return result;
  }
}
