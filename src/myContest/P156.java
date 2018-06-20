package myContest;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class P156 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList <String> words = new ArrayList <>() ;
		ArrayList <String> sortWords = new ArrayList <>();
		ArrayList <String> filterWords = new ArrayList <>() ;
		
		
		while(scan.hasNext())
		{
			String line = scan.next();
			if(line.equals("#"))
			{ 
				break;
			}
			String lowerCaseLine=line.toLowerCase();
			words.add(line);
			char []tempLetter;
			tempLetter=lowerCaseLine.toCharArray();
			Arrays.sort(tempLetter);
			
			sortWords.add(new String(tempLetter));
		}
		
		for(int i=0; i<words.size();i++)
		{
			boolean unique=true;
			for(int j=0; j<words.size()-1;j++)
			{
				if(j==i)
				{
					j++;
				}
				if(sortWords.get(i).equals(sortWords.get(j)))
				{
					unique=false;
				}
			}
			if(unique)
			{
				filterWords.add(words.get(i));
			}
		}
		Collections.sort(filterWords);
		for (String string : filterWords) {
			System.out.println(string);
		}
		scan.close();
	}

}
