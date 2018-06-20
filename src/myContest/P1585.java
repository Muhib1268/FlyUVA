package myContest;

import java.util.Scanner;

public class P1585 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		while(n-->0)
		{
			String marks=scan.next();
			char cross[]=new char[marks.length()];
			cross=marks.toCharArray();
			int perQstn[]=new int[marks.length()];
			for(int i=0; i<marks.length(); i++)
			{
				if(cross[i]=='X')
				{
					perQstn[i]=0;
				}
				else
				{
					if(cross[i]=='O' && i==0)
					{
						perQstn[i]=1;
					}
					else if(cross[i-1]=='O')
					{
						perQstn[i]=perQstn[i-1]+1;
					}
					else{
						perQstn[i]=1;
					}
				}
			}
			
			int result=0;
			for(int i=0;i<marks.length(); i++)
			{
				result+=perQstn[i];
			}
			System.out.println(result);
		}

		scan.close();
	}

}
