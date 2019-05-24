

import java.util.Scanner;

public class Emphasis {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String s=sc.nextLine();
	String st[]=s.split(" ");
	String fn=" ";
	for (int i = 0; i < st.length; i++) {
		if(i<st.length-1) {
		String sp=st[i];
		    for (int j = 0; j <sp.length(); j++) {
			 fn=fn+sp.charAt(j)+".";//using of double quote is for space b/t string
					break;
			}
		}else {
			fn=fn+st[i];
		}
		    
		    //System.out.println(fn);
	}
	System.out.println(fn);
}
}
