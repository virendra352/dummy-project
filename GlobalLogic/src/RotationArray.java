import java.util.Scanner;

public class RotationArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Array size");
	int s=sc.nextInt();
	int a[]=new int[s];
	System.out.println("Enter the element in Array");
	for (int i = 0; i < a.length; i++) {
		a[i]=sc.nextInt();
	}
	System.out.println("Enter the number how mny times rotat");
	int n=sc.nextInt();
	for (int i = 0; i <n; i++) {
		int last=a[a.length-1];
		for (int j = a.length-1;j>0 ;j--) {
			a[j]=a[j-1];
		}
		a[0]=last;
	}
	for (int i = 0; i < a.length; i++) {
		 System.out.println(a[i]);
	}
	
}
}
