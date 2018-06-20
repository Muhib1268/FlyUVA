package myContest;

import java.util.Scanner;
import java.util.HashMap;

public class P102 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		
		String bins[]={"BCG","BGC","CBG","CGB","GBC","GCB"};
		
		HashMap<Character, Integer> binEco=new HashMap<>();
		
		binEco.put('B',0);
		binEco.put('G',1);
		binEco.put('C',2);
		
		while(sc.hasNext())
		{
			
			
			int bin1[]=new int[3];
			int bin2[]=new int[3];
			int bin3[]=new int[3];
			
			for(int i=0; i<3; i++)
			{
				bin1[i]=sc.nextInt();
			}
			for(int i=0; i<3; i++)
			{
				bin2[i]=sc.nextInt();
			}
			for(int i=0; i<3; i++)
			{
				bin3[i]=sc.nextInt();
			}

			
			int bottleMove=0;
			for(int i=0;i<3; i++)
			{
				bottleMove+=bin1[i]+bin2[i]+bin3[i];
			}
			
			String bottleArrange="";
			
			for(int i=0; i<6; i++)
			{
				int tempMove=0;
				String temp=bins[i];
				char tempArr[]=temp.toCharArray();
				int index=binEco.get(tempArr[0]);
				tempMove=bin1[(index+1)%3]+bin1[(index+2)%3];
				
				index=binEco.get(tempArr[1]);
				tempMove += bin2[(index+1)%3]+bin2[(index+2)%3];
				
				index=binEco.get(tempArr[2]);
				tempMove += bin3[(index+1)%3]+bin3[(index+2)%3];
				
				if(bottleMove>tempMove)
				{
					bottleMove=tempMove;
					bottleArrange=temp;
				}
			}
			
			System.out.println(bottleArrange+" "+bottleMove);
		}
		
		
		sc.close();
	}

}
