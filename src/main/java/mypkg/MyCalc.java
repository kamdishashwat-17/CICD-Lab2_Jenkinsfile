package mypkg;

import java.util.Scanner;

public class MyCalc {
	public int sum(int a, int b)
	{
		return(a+b);		
	}
	public int diff(int a, int b)
	{
		return(a-b);		
	}
	public int mul(int a, int b)
	{
		return(a*b);		
	}
	public static void main(String[] args) {
		int num1, num2;
		MyCalc calc = new MyCalc();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 : ");
		num1 = sc.nextInt();
		System.out.println("Enter num2 : ");
		num2 = sc.nextInt();
		System.out.println("Sum is : "+calc.sum(num1, num2) );
		System.out.println("Diff is : "+calc.diff(num1, num2) );
	}
}