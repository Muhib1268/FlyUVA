package myContest;

import java.util.Scanner;

public class P11984 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int count=1;
		while(n-->0)
		{
			float celsius=scan.nextFloat();
			float fahrenhiteDiff=scan.nextFloat();
			celsius+=5*fahrenhiteDiff/9;
			System.out.format("Case %d: %.2f\n",count, celsius);
			count++;
		}

		scan.close();

	}

}
