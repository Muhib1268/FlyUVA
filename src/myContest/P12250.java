package myContest;

import java.util.Scanner;

public class P12250 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int count=1;
		while(scan.hasNext())
		{
			String salutation = scan.next();
			if(salutation.equals("#"))
			{ 
				break;
			}
			
			switch(salutation)
			{
				case "HELLO":
					System.out.println("Case "+count+": ENGLISH");
					count++;
					break;
				case "HOLA":
					System.out.println("Case "+count+": SPANISH");
					count++;
					break;
				case "HALLO":
					System.out.println("Case "+count+": GERMAN");
					count++;
					break;
				case "BONJOUR":
					System.out.println("Case "+count+": FRENCH");
					count++;
					break;
				case "CIAO":
					System.out.println("Case "+count+": ITALIAN");
					count++;
					break;
				case "ZDRAVSTVUJTE":
					System.out.println("Case "+count+": RUSSIAN");
					count++;
					break;
				default:
					System.out.println("Case "+count+": UNKNOWN");
					count++;
			}
		}
		scan.close();
	}

}
