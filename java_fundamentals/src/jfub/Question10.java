package jfub;
import java.util.*;
public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(Character.isLowerCase(ch)) {
			System.out.println(Character.toUpperCase(ch));	
		}
		if(Character.isUpperCase(ch)) {
			System.out.println(Character.toLowerCase(ch));	
		}

	}

}
