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
	     int max_from_right =  arr[n-1]; 
  
        // The next greatest element for the rightmost 
        // element is always -1 
        arr[n-1] = -1; 
  
	for(int i=n-2;i>=0;i--)
	{   int temp = arr[i]; 
  
            // Replace current element with the next greatest 
            arr[i] = max_from_right; 
  
            // Update the greatest element, if needed 
            if(max_from_right < temp) 
            max_from_right = temp; 
	}
	    
	    for(int a:arr )
	    {
	        System.out.print(a+" ");
	    }
	
	  System.out.println();  
	}
	    
	}
	}
