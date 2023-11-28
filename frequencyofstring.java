/**************************************************************************************
 * File:Palindrome
 * Author:Parvathi KB
 * Version:1.0
 * Description:to check wheather a number is palindrome or not
 * Date:03/10/23
 * ************************************************************************************/
package parubee;
import java.util.Scanner;
public class frequencyofstring {

	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentance:");
		String input=sc.nextLine();
		System.out.println("Enter a letter:");
		char letter=sc.next().charAt(0);
		int sent=checkfrequency(input,letter);
		System.out.println("Number of Times "+letter+" repeats="+sent);
	}

	static int checkfrequency(String input,char letter) {
	int count=0;
	char a[]=input.toCharArray();
	int len=input.length();
	for(int i=0;i<len;i++) {
		if (letter==a[i]) {
			count++;
	       }
	     }
	return count;
	}
	}
