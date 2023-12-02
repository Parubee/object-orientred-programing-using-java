package javalab;
import java.util.StringTokenizer;
import java.util.Scanner;
public class Stringtokenizer {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int sum=0;
			
	System.out.println("Enter a data:");
	String data=sc.nextLine();
	StringTokenizer str=new StringTokenizer(data);
	while(str.hasMoreTokens()) {
		
		int num=Integer.parseInt(str.nextToken());
		sum=sum+num;		
	}
	System.out.println("Sum =" +sum);
	}

	}

	