import java.util.Scanner;

public class FirstAndSec {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the size");
	int size=sc.nextInt();
	int a[]=new int[size];
	System.out.println("enter the element in array");
	for (int i = 0; i < a.length; i++) {
		  a[i]=sc.nextInt();
		  
	}
	int first=a[0];
	int sec=a[1];
	for (int i = 0; i < a.length; i++) {
		 if(a[i]>first) {///geater condition for biggest
			 sec=first;
			 first=a[i];	 
			 }
		 else if(a[i]>sec) {// greater condition for biggest	
			 sec=a[i];	 
			 }
	}	
	System.out.println(first+" "+sec);
}
}
