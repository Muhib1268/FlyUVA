package myContest;

import java.util.Scanner;

public class main {
	
	public static int CycleElm(int n){
		
			int count=0;
			int temp=n;
			
			while(temp>=1)
			{
				if(temp==1)
				{
					return ++count;
				}
				else if(temp%2!=0)
				{
					count++;
					temp=3*temp +1;
				}
				else
				{
					count++;
					temp/=2;
				}
			}
		return count;

	}
	public static int maxCount(int a, int b)
	{
		int countMax=0;
		for(int i=a; i<=b; i++)
		{
			int count=CycleElm(i);
			countMax=countMax>count?countMax:count;
		}
		return countMax;
	}
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int p=scan.nextInt();
		int q=scan.nextInt();
		
		System.out.println(p+ " "+q+" "+maxCount(p, q)+ "\n");

	}

}
