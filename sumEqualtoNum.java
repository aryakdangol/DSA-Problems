import java.util.*;
class sumEqualtoNum {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		int n = in.nextInt();
		int arr[] = new int[n];
		for (int i = 0 ; i < n; i++)
		{
			arr[i] = in.nextInt(); 
		}
		
		System.out.println(getPairsCount(arr,n,k));
	}
	
    static int getPairsCount(int[] arr, int n, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0 ; i < n; i++)
        {
            int freq = map.getOrDefault(arr[i],0);
            map.put(arr[i],++freq);
        }
        int count = 0;
        for (int i = 0; i < n; i++)
        {
            if (map.get(k - arr[i]) != null){
                count += map.get(k - arr[i]);
            }
            if (k-arr[i] == arr[i]){
                count--;
            }
        }
        return count / 2;
    }
}
