package data_structures;
import java.util.Scanner;
public class Rec_reverse {
    static void reverse(int arr[],int start,int end)
    {
    	int temp;
    	if(start>=end)
    		return;
    	temp=arr[start];
    	arr[start]=arr[end];
    	arr[end]=temp;
    	reverse(arr,start+1,end-1);
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
	System.out.println("reverse value");
	print(arr,6);

	}

}
