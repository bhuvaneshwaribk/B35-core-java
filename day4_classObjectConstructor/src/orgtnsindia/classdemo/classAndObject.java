package orgtnsindia.classdemo;
import java.util.Scanner;
public class classAndObject {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the speed of car");
		int speed=s.nextInt();
		
		// creation of object
		car o=new car();
		o.speed(speed);
        s.close();
	}

}
