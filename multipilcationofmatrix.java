/**************************************************************************************
 * File:Palindrome
 * Author:Parvathi KB
 * Version:1.0
 * Description:to check wheather a number is palindrome or not
 * Date:03/10/23
 * ************************************************************************************/
package parubee;
import java.util.Scanner;
public class multipilcationofmatrix {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		
		
		int i,j,k;
		System.out.println("Enter number of rows1:");
		
		
		int row1=sc.nextInt();
		System.out.println("Enter number of coloumn1:");
		int coloumn1=sc.nextInt();
		
		
		int[][]matrix1=new int[row1][coloumn1];
		System.out.println("Enter the numbers in firts matrix:");
		for(i=0;i<row1;i++){
			for(j=0;j<coloumn1;j++){
				matrix1[i][j]=sc.nextInt();
			}
		}
		
		
		System.out.println("First matrix is:");
		for(i=0;i<row1;i++){
			
			for(j=0;j<coloumn1;j++){
				System.out.print(matrix1[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("Enter number of rows2:");
		
		
		int row2=sc.nextInt();
		System.out.println("Enter number of coloumn2:");
		int coloumn2=sc.nextInt();
		
		
		int[][]matrix2=new int[row2][coloumn2];
		int[][]matrix3=new int[row1][coloumn2];
		System.out.println("Enter the numbers in second matrix:");
		for(i=0;i<row2;i++){
			for(j=0;j<coloumn2;j++){
				matrix2[i][j]=sc.nextInt();
			}
		}
		
		
		System.out.println("second matrix is:");
		for(i=0;i<row2;i++){
			
			for(j=0;j<coloumn2;j++){
				System.out.print(matrix2[i][j]+"\t");
			}
			System.out.println();
		}
if(coloumn1==row2) {

for(i=0;i<row1;i++) {
	for(j=0;j<coloumn2;j++){
		matrix3[i][j]=0;
		for(k=0;k<coloumn1;k++){
			
			matrix3[i][j]=matrix3[i][j]+matrix1[i][k]*matrix2[k][j];
		  }
		}
	}

System.out.println("resultant matrix is:");
for(i=0;i<row1;i++){
	for(j=0;j<coloumn2;j++){
		System.out.print(matrix3[i][j]+"\t");
	}
		System.out.println();
	   
     }
  }
else {
	System.out.println("multiplication is not possible");
	
}
	}
}


}
