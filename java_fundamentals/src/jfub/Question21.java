package jfub;
import java.util.*;
public class Question21 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int j=0;j<n;j++) {
			sum+=arr[j];
		}
		double avg=sum/arr.length;
		System.out.println(sum);
		System.out.println(avg);

	}

}
