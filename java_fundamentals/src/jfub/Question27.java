package jfub;
import java.util.*;
public class Question27 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		ArrayList<Integer>list=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			if(!list.contains(arr[i])) {
				list.add(arr[i]);
			}
		}
		for(int num:list) {
			System.out.print(num+" ");
		}


	}
}
