package javacode;

import java.util.Scanner;

public class testarray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[]=new int[10];
		String name[]=new String[10];
		System.out.println("enter array");
		for(int i=0;i<2;i++)
		{
			a[i]=sc.nextInt();
			name[i]=sc.next();
		}
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]+" name="+name[i]);
		}
		
	}

}
