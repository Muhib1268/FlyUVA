package myContest;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class P10107 {

	public static void main(String[] args) 
	{
		ArrayList<Long> list=new ArrayList<>();
		Scanner scan=new Scanner(System.in);
		int count=0;
		while(scan.hasNext())
		{
			long a=scan.nextLong();
			int out;
			list.add(a);
			Collections.sort(list);
			count++;
			if(count%2==0)
			{
				out=(count/2);
				long p=list.get(out);
				long q=list.get(out-1);
				long avg=(p+q)/2;
				System.out.println(avg);
			}
			else
			{
				System.out.println(list.get(count/2));
			}
		}
	}
}