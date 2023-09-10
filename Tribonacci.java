import java.util.HashMap;
public class Tribonacci {

    // using Brute force recursion + memoization
    public static int trib(int n)
    {
        return trib(n , new HashMap<>());
    }




    public static int trib(int n , HashMap<Integer , Integer> memo )
    {
        // 0 0 1 1 2 4 7 13 24 44 ......
        if( n == 0 || n == 1) return 0;
        if( n == 2 ) return 1;

        if(memo.containsKey(n))
        {
            return memo.get(n);
        }

        int result = trib(n-1 , memo) + trib(n-2 , memo) + trib(n-3 , memo);
        memo.put(n , result);
        return result;
    }

    public static void main(String[] args){
        System.out.println(trib(3));
    }
    
}
