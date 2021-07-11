import java.util.*;

class recursion
{
	public static HashMap<Integer,Integer> val = new HashMap<Integer,Integer>();
	public static void main(String[] main)
	{
		int num = 5;
		System.out.println(recursiveFactorial(num));
		
		
		System.out.println(fib(45));
	}
	public static int recursiveFactorial(int num)
	{
		if(num == 0)
			return 1;
		
		return num * recursiveFactorial(num-1);
	}
	
	public static int fib(int n)
	{
		if (n==0)
			return 0;
		if (n <=2)
			return 1;
		return fib(n-1) + fib(n-2);
	}
	
	public static int newfib(int n)
	{
		if (val.containsKey(n))
			return val.get(n);
		if (n == 0)
			return 0;
		if (n <= 2)
			return 1;
		val.put(n, newfib(n-1) + newfib(n-2));
		return val.get(n);
	}
}