import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution 
{	 
	public static void main(String args[])
	{
		long len = 0;
		System.out.println("Enter the no of elements"); //Taking the no of elements to be inserted in the ArrayList
		Scanner sc1 = new Scanner(System.in);
		len = sc1.nextLong();
		List<Integer> A = new ArrayList<Integer>();
		System.out.println("Enter Values"); //Taking the values of the elements
		Scanner sc = new Scanner(System.in);
		for(int x=0;x<len;x++)
		{
			A.add(sc.nextInt()); // Adding the values to the ArrayList
		}
		System.out.println(solution(A)); //calling the function solution and displaying the value returned by it.
	}
	public static int solution(List<Integer> A) //function that returns the no of pairs of crossing people
	{
		int count1 = 0;
		for(int i=0;i<A.size()-1;i++)          //compairing the elements of the ArrayList  
		{
			for(int j=i+1;j<A.size();j++)
			{
				if(A.get(i) != A.get(j) && A.get(i) != 1)  //Making pairs in format (0,1)
						
				{
				    count1++; // counting the no of pairs
				}
			}
		}
		if(count1 < 1000000000)
		{
			return count1; //if no of (0,1) pairs is less than 1000000000 returning the value of count
		}
		else
		{
			return -1; // else returning -1
		}
	}
}


