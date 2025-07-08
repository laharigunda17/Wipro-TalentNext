package jfub;
import java.util.*;
public class Question30 {
	static void EvenOdd(int[] arr) {
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				arr[index++]=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				arr[index++]=arr[i];
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		EvenOdd(arr);
		for(int num:arr) {
			System.out.print(num+" ");
		}
	}
}
		
		


