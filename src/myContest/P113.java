package myContest;

import java.util.Scanner;

public class P113 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		while(scan.hasNext())
		{
			double n=scan.nextDouble();
			double p=scan.nextDouble();
			System.out.format("%.0f\n",Math.pow(p, 1/n));
		}
		
		scan.close();
	}

}
