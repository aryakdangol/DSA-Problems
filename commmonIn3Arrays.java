import java.util.*;

class commonIn3Arrays
{
	public static void main() {
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int n3 = in.nextInt();
		
		int A[] = new int[n1];
		int B[] = new int[n2];
		int C[] = new int[n3];
		
		for (int i = 0; i < n1; i++)
		{
			A[i] = in.nextInt();
		}
		for (int i = 0; i < n2; i++)
		{
			B[i] = in.nextInt();
		}	
		for (int i = 0; i < n3; i++)
		{
			C[i] = in.nextInt();
		}
	}
	
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here
        ArrayList<Integer> list = new ArrayList<Integer>();

        int i = 0;
        int j = 0;
        int k = 0;

        while(i<n1 && j<n2 && k<n3)
        {
            int a = A[i];
            int b = B[j];
            int c = C[k];

            int max = a;
            if(b>max)
            {
                max = b;
            }
            if(c>max)
            {
                max = c;
            }

            if(a==b && b==c)
            {
                if(!list.contains(a))
                {
                    list.add(a);
                }
                i++; j++; k++;
            }

            else
            {
                if(max == a)
                {
                    if(max!=b)
                    {
                        j++;
                    }
                    if(max !=c)
                    {
                        k++;
                    }
                }

                else if(max == b)
                {
                    if(max!=a)
                    {
                        i++; 
                    }
                    if(max !=c)
                    {
                        k++;
                    }
                }
                else if(max == c)
                {
                    if(max!=a)
                    {
                        i++; 
                    }
                    if(max !=b)
                    {
                        j++;
                    }
                }
            }

        }

        return list;

    }
}