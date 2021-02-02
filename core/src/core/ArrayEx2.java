package core;

import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		int i;
		int ar[] = new int[5];
		Scanner s=new Scanner(System.in);
		for(i=0;i<ar.length;i++)
		{
			if(i==3)
			{
				continue;  //if the condition is true then continue keyword ensure to skip execution of rest of the code in loop and move to beginning of loop to increment i value
			}
			System.out.println("Enter a number");
			ar[i]=s.nextInt();
		}
		
		/* Instead of writing so many input statements we can write loop statement as above
		System.out.println("Enter a number");
		ar[0]=s.nextInt();
		ar[1]=s.nextInt();
		ar[2]=s.nextInt();
		ar[4]=s.nextInt();
		*/
		
		for( i=0;i<ar.length;i++)
		{
			System.out.println(i+" Index "+ ar[i]);
		}
		/* Instead of writing so many Sysout statements we can write loop statement as above
		System.out.println("0 Index "+ ar[0]);
		System.out.println("1 Index "+ ar[1]);
		System.out.println("2 Index "+ ar[2]);
		System.out.println("3 Index "+ ar[3]);
		System.out.println("4 Index "+ ar[4]);
		*/
		int ar2[]= {1,2,3,4};
		for(i=0;i<ar2.length;i++)
		{
			System.out.println(i+" Index "+ ar2[i]);
		}
		
		
	}

}
