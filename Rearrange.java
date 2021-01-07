package data_structures;
import java.util.*;
public class Rearrange {
    static void rearrange(int ar[],int n)
    {
    	int i,j,temp;
    	for(i=0;i<n;i++)
    	{
    		for(j=0;j<n;j++)
    		{
    			if(ar[j]==i)
    			{
    				temp=ar[j];
    				ar[j]=ar[i];
    				ar[i]=temp;
    				break;
    			}
    		}
    	}
    	for(i=0;i<n;i++)
    	{
    		if(ar[i]!=i)
    			ar[i]=-1;
    	}
    	System.out.println("rearranged data:");
    	for(i=0;i<n;i++)
    		System.out.println(ar[i]+" ");
    }
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int ar[]=new int[10];
	System.out.println("enter 10 numbers:");
	for(int i=0;i<10;i++)
		ar[i]=sc.nextInt();
	int n=10;
	rearrange(ar,n);

	}

}
