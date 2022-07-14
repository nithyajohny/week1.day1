package week1.day1;

import java.util.Scanner;

public class IsPrime

{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//
		//get the input from user store it as i using scanner.
		//for loop starts from number2 and keep on check until the input number.
		// for to check reminder use mod operator,if reminder is 0 then not prime.else prime. 
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
	     int i = sc.nextInt();
		
		for(int i1=2;i1<i;i1++)
		{
			if(i%i1==0)
			{
				System.out.println(i+" is not a prime number");
				break;
			}
			else
			{
				System.out.println(i+" is a prime number");
				break;
		    }
		}

	}

}
