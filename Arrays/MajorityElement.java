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
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=sc.nextInt();
	        
	    }
	    int count =0; int nums=0;
	    for(int i=0;i<n;i++)
	    { if(count==0)
	    {
	        nums=arr[i];
	        count++;
	    }
	    else if(arr[i]==nums)
	    {
	        count++;
	    }
	    else {
	        count--;
	    }
	    }
	    count=0;
	    boolean f=false;
	    for(int i=0;i<n;i++)
	    {
	        if(arr[i]==nums)
	        { count++;
	         if(count>n/2)
	        { System.out.println(nums);
	        f=true;
	           break; }
	        }
	    }
	    if(!f)
	    {
	         System.out.println(-1);
	    }
	        
	    }
	}
	    
	
}