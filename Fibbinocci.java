package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 0   1   1  2  3  5  8  13...
		// fn  sn  s                            fn=first num; sn= sec num; s=sum;
		// initialize the first 2 numbers and get the sum by adding it.
		//now for second iteration sec num of 1st iteration becomes 1stnum.sum becomes sec num.
		//now add these 2 numbers and get sum. 
		//iteration will go on(use for loop).
		int firstnum=0;
		int secnum=1;
		int sum=1;
		System.out.println(firstnum);
		System.out.println(secnum);
		for (int i=0; i < 9; i++)
		{
			sum= firstnum+secnum;
			System.out.println(sum);
			firstnum=secnum;
			secnum=sum;

		}

	}

}
