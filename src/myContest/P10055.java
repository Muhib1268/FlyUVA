package myContest;
import java.util.Scanner;

public class P10055 {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext())
		{
			long a=scan.nextLong();
			long b=scan.nextLong();
			System.out.println(Math.abs(b-a));
		}
		scan.close();

	}

}
