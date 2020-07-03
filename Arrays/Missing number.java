/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		        Scanner sc=new Scanner(new InputStreamReader(System.in));
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        int n=sc.nextInt();
	        int arr[]=new int[n-1];
	        
	        for(int i=0;i<n-1;i++)
	        {
	            arr[i]=sc.nextInt();
	        }
	   
	    int x1 = arr[0]; 
        int x2 = 1; 
  
        /* For xor of all the elements  
           in array */
        for (int i = 1; i < n-1; i++) 
            x1 = x1 ^ arr[i]; 
  
        /* For xor of all the elements  
           from 1 to n+1 */
        for (int i = 2; i <= n; i++) 
            x2 = x2 ^ i; 
  int ans=x1^x2;
	        System.out.println(ans);
	    }
	}
}
