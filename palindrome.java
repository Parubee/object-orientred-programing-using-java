package parubee;

import java.util.Scanner;
public class palindrome {
public static void main(String args[]){
		
		String word;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string:");
		word=sc.next();
	
		boolean isPalindrome=check(word);
		if(isPalindrome) 
		System.out.println(word+" is palindrome ");
		else 
			System.out.println(word+" is not palindrome ");
	}
	
			static boolean check(String word) {
			char Array[]=word.toCharArray();
	
				int length=word.length();
				for(int i=0;i<=(length/2);i++) {
					if(Array[i]!=Array[length-i-1]) {
						return false;
					}
				}
	return true;
		}
	}



