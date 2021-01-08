package data_structures;
import java.util.*;
public class Reverse {
    static void reverse(int arr[],int start,int end)
    {
    	int temp;
    	while(start<end)
    	{
    		temp=arr[start];
    		arr[start]=arr[end];
    		arr[end]=temp;
    		start++;
    		end--;
    	}
    }
    static void print(int arr[],int size)
    {
    	for(int i=0;i<6;i++)
    		System.out.print(arr[i]+" ");
    }
	public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	int arr[]=new int[6];
	System.out.println("enter 6 values:");
	for(int i=0;i<6;i++)
		arr[i]=obj.nextInt();
	reverse(arr,0,5);
	System.out.println("reverse value:");
	print(arr,6);

	}

}
