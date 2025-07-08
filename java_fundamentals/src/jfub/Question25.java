package jfub;
import java.util.*;
public class Question25 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int s1=Integer.MAX_VALUE;
		int s2=Integer.MAX_VALUE;
		int l1=Integer.MIN_VALUE;
		int l2=Integer.MIN_VALUE;
		for(int num:arr) {
			if(num>l1){
				l2=l1;
				l1=num;
			}
			else if(num>l2) {
				l2=num;
			}
			if(num<s1){
				s2=s1;
				s1=num;
			}
			else if(num<s2) {
				s2=num;
			}
		}
		System.out.println("Smallest1 "+s1);
		System.out.println("Smallest2 "+s2);
		System.out.println("largest1 "+l1);
		System.out.println("largest2 "+l2);

	}

}
