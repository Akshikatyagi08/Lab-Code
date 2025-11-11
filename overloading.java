package javacode;
import java.util.*;

public class overloading {
	int a,b;
	public void add() {
	this.a=5;
	this.b=10;
	System.out.println("sum without input:" +(this.a+this.b));
	}
	
	public void add(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println("sum with imput:" +(this.a+this.b));
		
	}
	
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		overloading obj = new overloading();
		obj.add();
		System.out.println("enter the 1st number:");
		int num1 = sc.nextInt();
		System.out.println("enter the 2nd number:");
		int num2 = sc.nextInt();
		obj.add(num1 ,num2);
		
	}
}
