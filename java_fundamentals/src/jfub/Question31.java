package jfub;
import java.util.*;
public class Question31 {
	public static boolean Only14(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=1 && arr[i]!=4) {
				return false;			
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		boolean r=Only14(arr);
		System.out.print(r);

		
	}

}
