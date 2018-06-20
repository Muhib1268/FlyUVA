package myContest;

import java.util.Scanner;

public class P10018 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		while(n-->0)
		{
			long num=scan.nextInt();
			int iteration=0;
			while(num!=0)
			{
				String numeric=String.valueOf(num);
				String rev=(new StringBuilder(numeric)).reverse().toString();
				num+=Long.parseLong(rev);
				iteration++;
				if(isPalindrome(num))
				{
					break;
				}

			}
			
			System.out.println(iteration+" "+num);			
		}
		
		scan.close();
	}
	public static boolean isPalindrome(long testNum)
	{
		String numeric=String.valueOf(testNum);
		return (new StringBuilder(numeric)).reverse().toString().equals(numeric);
	}

}
