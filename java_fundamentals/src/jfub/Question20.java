package jfub;
import java.util.*;
public class Question20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int num = sc.nextInt();
	        int original = num;
	        int reversed = 0;

	        // Reverse the number using for loop
	        for (; num > 0; num /= 10) {
	            int digit = num % 10;
	            reversed = reversed * 10 + digit;
	        }

	        // Check if original and reversed are the same
	        if (original == reversed) {
	            System.out.println(original + " is a Palindrome Number.");
	        } else {
	            System.out.println(original + " is not a Palindrome Number.");
	        }

	        sc.close();

	}

}
