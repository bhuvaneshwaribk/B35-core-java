package arryaDemo;

import java.util.Scanner;

public class ArrayUserInputDemo {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s= new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size=s.nextInt();
		int arr[]=new int[size];
		System.out.println("enter the element of array:");
		for (int i=0;i<arr.length;i++)
		{
			System.out.println("enter the"+i+"index");
			arr[i]=s.nextInt();
		}
		System.out.println("array elements are:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");

		}


		
	}

}
