import java.util.Random;
import java.util.Scanner;

public class StringClass {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the String");
	String s=sc.nextLine();
	char ch[]=s.toCharArray();
		
	System.out.println("Enter the index from where u want to split string");
    int  in=sc.nextInt();
		 
		/*
		 * Random r=new Random(); int in=r.nextInt(ch.length);
		 */
		String first="";
		String secnd="";
	for (int j = 0; j < ch.length; j++) {
		 if (j<=in) {
			 first=first+ch[j];
		 }
		 else {
			 secnd=secnd+ch[j];
		 }
	}
	System.out.println(first+" "+secnd);
	
}
}
