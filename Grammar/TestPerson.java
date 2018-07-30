import java.util.Scanner;

public class TestPerson{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Plase input your name here");
		String name = sc.next();
		System.out.println("Plase input your age here");
		int age = sc.nextInt();
		System.out.println("Plase input your gender here");
		String gender = sc.next();
		System.out.println("The computer recorded that:");
		System.out.println("Your name is " + name );
		System.out.println("Your age is " + age );
		System.out.println("Your gender is " + gender );
	}
}