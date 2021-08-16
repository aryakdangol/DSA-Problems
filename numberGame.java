// You are using Java
//There are N numbers placed on a table. Since two players are playing the game, they will make their moves alternatively. In one move a player can perform the following operation.
/*A player will choose a number from the table and will replace that number with one of its divisor. For example, 6 can be replaced with 1, 2, or 3 (since these are the divisors of 6). Similarly, 12 can be replaced with 1, 2, 3, 4 or 6.
It is mandatory that the player has to replace the number.
A player cannot put back the same number on table.
As 1 does not have any divisor other than itself, a player cannot replace 1 with any other number. So soon a situation will arise when there will be only all 1s on the table. In that situation the player will not be able to make any move. The player who will not be able to make the move, loses.
Both the players are masters of this game. So they will play the game optimally.
Aman will make the first move of the game.
As you will be given N integers that are on the table. You have to predict, who will win the game – Aman or Jasbir.*/

import java.util.*;

class numberGame{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0;  i  < n; i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.println(getWinner(n,arr));
    }
    
    public static String getWinner(int n, int[] arr)
    {
        if (n == 1 )
            return "AMAN";
        
        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            sum = sum ^ arr[i];
        }
        
        if (sum == 0)
            return "JASBIR";
        else
            return "AMAN";
        
    }
}