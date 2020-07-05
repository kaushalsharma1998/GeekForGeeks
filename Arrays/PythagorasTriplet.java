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
	        int k=sc.nextInt();
	        arr[i]=k*k;
	        
	    }
	    Arrays.sort(arr);
	    boolean f=false;
	    for(int i=2;i<n;i++)
	    {
	       
	       int l=0,r=i-1;
	       while(l<r)
	       {
	           if(arr[l]+arr[r]==arr[i])
	           { f=true;
	            break;
	                
	           }
	           else if (arr[l] + arr[r] < arr[i])
	           l++;
	           else 
	           r--;
	       }
	    
	       
	    }
	
	     if(!f)
	        System.out.println("No");
	        else
	        System.out.println("Yes");
	}
}
}


