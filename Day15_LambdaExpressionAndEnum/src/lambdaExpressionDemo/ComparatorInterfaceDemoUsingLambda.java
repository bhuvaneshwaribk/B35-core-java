package lambdaExpressionDemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorInterfaceDemoUsingLambda {
	public static void main(String [] args) {
		//comparater is as functional interface which contains exactly one abstract method
		Comparator<String>obj=(s1,s2)->Integer.compare(s1.length(),s2.length());
		String str[]= {"bhuvaneshwari","kalapur","basavaraj","Deeksha"};		
		//arrange into ascending order
		Collections.sort(Arrays.asList(str),obj);
		for(String itr:str)
		{
			System.out.println(itr+" ");
		}
	}

}
