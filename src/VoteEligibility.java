import java.util.Scanner;


public class VoteEligibility {
	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your age: ");
		age = sc.nextInt();
		//using if else 
		if (age >= 18){
			System.out.println("You are eligilible to vote.");
		}
		else {
			System.out.println("You are not eligible to vote.");
		}
	}

}
