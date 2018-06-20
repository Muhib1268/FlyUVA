package myContest;
import java.util.Scanner;

public class P10071 {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext())
		{
			int a=scan.nextInt();
			int b=scan.nextInt();
			int v=2*a*b;
			System.out.println(v);
		}
		scan.close();
	}
}