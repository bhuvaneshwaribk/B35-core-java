package lambdaExpressionDemo;

public class EmployeeExecutorUsingLambda {
	public static void main(String [] args) {
		//implementing the functional interface Employee using Lambda Expression
		/*Employee obj=()->{
			System.out.println("Lambda expression-No parameter");
			
		};
		obj.display();*/
		
		//implementing the functional interface Employee using Lambda Expression
				/*Employee obj=(int a,int b)->{
					int result=(a>b)?a:b;
					System.out.println("The maximum number is:"+result);
					return result;
					
				};
				obj.max(28,34);*/
		//Lambda Expression without return type
		Employee obj=
				(a,b)->(a>b)?a:b;
		System.out.println("The maximum number is:"+obj.max(26,34));

		
		
	}

}
