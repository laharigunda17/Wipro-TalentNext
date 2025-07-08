package jfub;
import java.util.*;
public class Question32 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] a=new int[3];
		int[] b=new int[3];
		for(int i=0;i<3;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<3;i++) {
			b[i]=sc.nextInt();
		}
		int[] arr=middle(a,b);
		for(int num:arr) {
			System.out.print(num+" ");
		}

	}
	public static int[] middle(int[] a, int[]b) {
		return new int[] {a[1],b[1]};
	}


}
