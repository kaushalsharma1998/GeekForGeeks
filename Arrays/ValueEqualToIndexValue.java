/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner( new InputStreamReader(System.in));
	int t=sc.nextInt();
	
	while(t-->0)
	{
	    int n=sc.nextInt();
	    int arr[]=new int[n+1];
	    for(int i=1;i<n+1;i++)
	    {
	        arr[i]=sc.nextInt();
	        
	    }
	boolean f=false;
	    for(int i=1;i<n+1;i++)
	    { if(arr[i]==i)
	      {  System.out.print(arr[i]+" ");
	      
	           f=true;
	      } 
	    }
	    if(!f)
	    System.out.print("Not Found");
	    System.out.println();
	}
	
	   
}
}