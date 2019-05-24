import java.util.Scanner;

public class SecondString {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the String");
	String s=sc.nextLine();
	char ch[]=s.toCharArray();
	int count=0;
	for (int i = 0; i < ch.length; i++) {
		 if(ch[i]=='_') {
			 count++;
		 }
	}
	System.out.println(count);
}
}
