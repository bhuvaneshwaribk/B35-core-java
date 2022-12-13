package lambdaExpressionDemo;

public class RunnableInterfaceDemoUsingLambda {
	public static void main(String [] args) {
		Runnable obj=()->
		{
			System.out.println("Implementing runnable interface");
		};
		obj.run();
		
	}

}
