package myContest;

import java.util.Stack;
import java.util.Scanner;

public class P673 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		scan.nextLine();
		while(n-->0)
		{
			String parentheses=scan.nextLine();
			System.out.println(countBrace(parentheses)?"Yes":"No");
		}

	}
	
	public static boolean countBrace(String braces)
	{
		Stack<Character> pile=new Stack<>();
		
		char[] bracketArr=new char[braces.length()];
		bracketArr=braces.toCharArray();
		pile.clear();
		for(int i=0; i<braces.length(); i++)
		{
			if(bracketArr[i]=='('||bracketArr[i]=='{'||bracketArr[i]=='[')
			{
				pile.push(bracketArr[i]);
			}
			else if(bracketArr[i]==')'||bracketArr[i]=='}'||bracketArr[i]==']')
			{
				if(pile.empty())
				{
					return false;
				}
				else if(bracketArr[i]==')')
				{
					if(pile.pop()!='('){
						return false;
					}
				}
				else if(bracketArr[i]=='}')
				{
					if(pile.pop()!='{'){
						return false;
					}
				}
				else if(bracketArr[i]==']')
				{
					if(pile.pop()!='['){
						return false;
					}
				}
			}
			
		}
		return true;
	}

}
