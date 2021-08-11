import java.util.Scanner;

public class Solution 
{	 
	public static void main(String args[])
	{
		int A[] = new int[5];
		// Hard Coded Inputs
		A[0] = 0;A[1] = 1;A[2] = 0;A[3] = 1;A[4] = 1;
		// User Given Inputs
		/*System.out.println("Enter Values");
		Scanner sc = new Scanner(System.in);
		for(int x=0;x<a.length;x++)
		{
			a[x] = sc.nextInt();
		}*/
		System.out.println(solution(A)); //calling the function solution and displaying the value returned by it.
	}
	public static int solution(int[] A) //function that returns the no of pairs of crossing people
	{
		int count1 = 0;
		for(int i=0;i<4;i++)            
		{
			for(int j=i+1;j<5;j++)
			{
				if(A[i] != A[j] && A[i] != 1)  
				{
				    count1++;
				}
			}
		}
		if(count1 < 1000000000)
		{
			return count1;
		}
		else
		{
			return -1;
		}
	}
}


