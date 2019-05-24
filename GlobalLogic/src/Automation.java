import java.util.Scanner;

public class Automation {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String s=sc.nextLine();
	String st[]=s.split(" ");
	String fn=" ";
	for (int i = 0; i < st.length; i++) {
		String sp=st[i];
		    for (int j = 0; j < sp.length(); j++) {
			 fn=fn+" "+sp.charAt(j);//using of double quote is for space b/t string
					break;
			}
		    //System.out.println(fn);
	}
	System.out.println(fn);
}
}
