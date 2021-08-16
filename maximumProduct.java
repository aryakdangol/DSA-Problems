import java.util.*;

class maximumProduct {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n ; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println(maxProduct(arr,n));
	}
	
    // Function to find maximum product subarray
    static int maxProduct(int[] arr, int n) {
        // code here
 
        int max = arr[0];
        int localMax = arr[0];
        for (int i = 1; i < n ; i ++)
        {
           	System.out.println(max);
           	System.out.println(localMax);
            if (arr[i] == 0)
                localMax = 0;
            else if (i+1 < n  && arr[i] < 0 && arr[i+1] < 0)
            {
                 localMax = Math.max(max, localMax * arr[i] * arr[i+1]);
                 i = i +1;
                if (localMax > max)
                    max = localMax;
            }
            else{
                localMax = Math.max(max, localMax * arr[i]);
                if (localMax > max)
                    max = localMax;
            }
         
        }
        return max;
    }
}