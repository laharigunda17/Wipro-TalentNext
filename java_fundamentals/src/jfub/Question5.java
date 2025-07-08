package jfub;
import java.util.*;
public class Question5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		if((num1>0) && (num2>0)) {
			if((num1%10)==(num2%10)) {
				System.out.println("True");
			}
			else {
				System.out.println("False");
			}
		}
		else {
			System.out.println("Enter positive number only");
		}
	}

}
