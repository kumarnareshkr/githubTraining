package progrms2;

import java.util.Scanner;

public class Count {
	public static void main(String[] args) {
		System.out.println("enter the paranthesis");
		Scanner s=new Scanner(System.in);
		String str = s.next();
		int count1=0;
		int count2=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='(') {
				count1++;
			}
			else if(str.charAt(i)==')') {
				count2++;
			}
			
		}
		if(count1==count2) {
			System.out.println("no error");
		}
		else {
			System.out.println("error");
		}
	}

}
