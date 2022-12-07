package arryaDemo;

public class ArrayDemo {

	public static void main(String[] args) {
		//multiple ways to declare and initialize the array
		int[]arr= {10,20,30,40};
		char[]arr1= {'a','b','c','d'};
		float arr2[]= {10.8f,39.4f,74.9f,83.6f};
		int arr3[]=new int[4];
		arr3[0]=14;
		arr3[1]=58;
		arr3[2]=89;
		arr3[3]=55;


		System.out.println("the element of array is:"+arr[3]);
		System.out.println("the element of array is:"+arr1[1]);
		System.out.println("the element of array is:"+arr2[3]);
		System.out.println("the element of array is:"+arr3[1]);
		
		//print all element by using for loop
		for (int itr:arr3)
		{
			System.out.print(itr+" ");
		}
		


		

		
		

	}

}
