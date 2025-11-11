package javacode;
import java.util.Scanner;

public class constructor {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the range");
	int srange=sc.nextInt();
	int erange=sc.nextInt();
	int c3=0,c5=0,c7=0;
	for(int i=srange;i<=erange;i++) {
		if(i%3==0) {
			c3++;
		}
		if(i%5==0){
		  c5++;
		}
		if(i%7==0){
			  c7++;
			}
	}
	System.out.println("dividible by 3:" + c3);
	System.out.println("divisible by 5:" + c5);
	System.out.println("divisible by 7:" + c7);
  

}

}
