import java.util.Scanner;

public class AscendingOrder {
	 public static int[] ascending(int arr[]) {
		 for (int i = 0; i < arr.length; i++) {
			for (int j =i+1; j < arr.length; j++) {
				 if(arr[i]>arr[j]) {
					 int temp=arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;
				 }
			}
		}
		 
		return arr;
		 
	 }
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the size of an array");
	int size=sc.nextInt();
	int arr[]=new int[size];
	System.out.println("enter the element in an array");
	for (int i = 0; i <size; i++) {
		  arr[i]=sc.nextInt();
		  
	}
	int[] rs=ascending(arr);
	for (int i = 0; i < rs.length; i++) {
		System.out.println(rs[i]);
	}
	
}
}
