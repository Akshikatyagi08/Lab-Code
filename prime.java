package javacode;

import java.util.Scanner;

public class prime {
	public static void main(String[] args) {
		int s,e;
		System.out.println("enter the start range");
		Scanner sc=new Scanner(System.in);
		s=sc.nextInt();
		System.out.println("enter the end range");
		e=sc.nextInt();
		for(int i=s;i<e;i++) {
			int c=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					c++;
				}
			}	
			if(c==0) {
				System.out.println(i);
			}
		}
	}

}
