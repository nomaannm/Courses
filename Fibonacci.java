import java.util.HashMap; //for memoization , a fast look Data structure

class Fibonacci
{
    //Recursion + Memoization
    //Memoization is used to eliminate brute force recursion
    public static int fib(int n){
        return fib(n , new HashMap<>());
    }

    // An overloaded function 
    public static int fib(int n, HashMap<Integer, Integer> memo)
    {
        if ( n == 0 || n == 1 ) return n ; // base cases
        if(memo.containsKey(n))
        {
            return memo.get(n);
        }


        int result =  fib(n-1 , memo) + fib(n-2,memo) ;
        memo.put(n,result);
        return result ; 
    }
    public static void main(String[] args)
    {
        System.out.println(fib(1000));

    }

}