/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
//xor of even elements give 0
class GFG {
	public static void main (String[] args) {
		//code
	
	    Scanner sc=new Scanner( new InputStreamReader(System.in));
	int t=sc.nextInt();
	while(t-->0)
	{
	     int n=sc.nextInt();
	    int arr[]=new int[n];
	    int x=0;
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=sc.nextInt();
	       x=x^arr[i]; 
	    }
	System.out.println(x);
	}
	
	    
	}
}