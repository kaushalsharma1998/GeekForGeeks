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
	    int min=(int)1e6;
	    Arrays.sort(arr);
	    //System.out.println(Arrays.toString(arr));
	    for(int i=0;i<n-1;i++)
	    {
	        min=Math.min(min,arr[i+1]-arr[i]);
	    }
	    System.out.println(min);
	}
	
	    
	}
}