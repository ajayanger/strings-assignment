package assignment3;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
	public static void main(String[] args) {
		String name1;
		String name2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name1 ");
		name1=sc.next();
		System.out.println("Enter name2 ");
		name2=sc.next();
		char c1[]=name1.toCharArray();
		char c2[]=name2.toCharArray();
		if(c1.length!=c2.length) {
			System.out.println("Not anagram ");	
		}else {
		Arrays.sort(c1);
		Arrays.sort(c2);
		    if(c1!=c2)
		       {
			      System.out.println("Not anagram ");
			    }
		    else {
		    	System.out.println("anagram");	
		    }
			            
		}
	}	
}
