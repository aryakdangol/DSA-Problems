import java.util.*;

class FractionalKnapsack
{
	public static void main(String[] args)
	{
		int profit[] = {10, 5, 15, 7, 6, 18, 3};
		int weight[] = {2, 3, 5, 7, 1, 4, 1};
		int capacity = 15;
		int n = weight.length;
		Item item[] = new Item[n];
		for(int i=0; i<n; i++)
		{
			item[i] = new Item(weight[i], profit[i]);
		}
		Arrays.sort(item, new Comparator<Item>()
				{
					@Override
					public int compare(Item i1, Item i2)
					{
						if(i1.pw > i2.pw)
							return -1;
						if (i1.pw < i2.pw)
							return 1;
						return 0;
					}
				});
		for(Item i: item)
		{
			System.out.println("Weight: " + i.wt + " Profit: "+ i.p + " P/W: " +i.pw);
		}
		double x[] = new double[n];
		int j = 0;
		int val = capacity;
		for(int i = 0; i < n; i++)
		{
			if(val - item[i].wt < 0)
			{
				x[j] = ((double)val/(double)item[i].wt);
				break;
			}
			else
			{
				x[j++] = 1;
				val -= item[i].wt;
				//System.out.println("VALUE: " + val);
			}
		}
		int totalweight = 0;
		double totalprofit = 0;
		int i=0;
		/*for(double k: x)
		{
			System.out.print(k + ", ");
		}*/
		System.out.println();
		for (double k: x)
		{
			totalweight += k * item[i].wt;
			totalprofit += k* item[i].p;
			i++;
		}
		System.out.println(totalweight);
		System.out.println(totalprofit);
	}
}

class Item
{
	public int wt;
	public int p;
	public double pw;
	
	public Item(int wt, int p)
	{
		this.wt = wt;
		this.p = p;
		this.pw =(double)this.p / this.wt;
	}
}
