https://practice.geeksforgeeks.org/problems/longest-span-with-same-sum-in-two-binary-arrays/0

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
//method one is to run two  nested loops(j=i , second one ) and check the sum value  
//if same update len=j-i+1, return maxlength
class GFG {
	public static void main (String[] args) {
		//code
	    Scanner sc=new Scanner(new InputStreamReader(System.in));
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        int n=sc.nextInt();
	        int arr[]=new int[n];
	        int arr2[]=new int[n];
	        for(int i=0;i<n;i++)
	        {
	            arr[i]=sc.nextInt();
	        }
	    
	        for(int i=0;i<n;i++)
	        {
	            arr2[i]=sc.nextInt();
	        }
	        
	        int pfsum=0;
	        int pfsum2=0;
	        int temp[]= new int[2*n+1];
	     Arrays.fill(temp,-1); 
	        int maxlength=0;
	        
	        for(int i=0;i<n;i++)
	        {
	            pfsum +=arr[i];
	            pfsum2+=arr2[i];
	            int curdiff=pfsum-pfsum2;
	            int diffidx=n+curdiff;//to avoid -ve index 
	            if(curdiff==0)
	            maxlength=i+1;
	            else if(temp[diffidx]==-1)
	            temp[diffidx]=i;
	            else
	            {
	                int len=i-temp[diffidx];
	                maxlength=Math.max(maxlength,len);
	            }
	            
	                
	            
	        }
	        System.out.println(maxlength);
	    }
	    
	    
	}
}