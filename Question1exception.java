package javatask7;
import java.util.Scanner;
public class Question1exception {

	public static void main(String[] args) {
		division();
	}
	
	public static void division() {
		try {
Scanner sc = new Scanner(System.in);
System.out.println("Enter First number -- ");
int num1=sc.nextInt();
System.out.println("Enetr Second number -- ");
int num2=sc.nextInt();
int num3 = num1/num2;
System.out.println("Division of num1 and num2 is -- "+num3);
		}
		catch(Exception e) {
			
			System.out.println("Do not use Zero as num2");
		}
		}
}
