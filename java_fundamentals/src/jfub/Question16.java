package jfub;
import java.util.*;
public class Question16 {

	public static void main(String[] args) {
		for(int i=10;i<=99;i++) {
			boolean isvalid=true;
			for(int j=2;j<Math.sqrt(i);j++) {
				if(i%j==0) {
					isvalid=false;
					break;
				}
			}
			if(isvalid) {
				System.out.print(i+" ");
			}
		}

	}

}
