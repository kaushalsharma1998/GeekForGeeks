/*A Better Solution is to use the fact that if subarray arr[i:j] 
is not strictly increasing, then subarrays arr[i:j+1], arr[i:j+2], .. arr[i:n-1] 
cannot be strictly increasing 

THE NU8MBER OF ELEMENT CAN BE FOUND OUT USING (LEN*(LEN-1))/2
*/
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
	 int count=0;
	 int length=1;
	    for(int  i=0;i<n-1;i++)
	    {
	        if(arr[i+1]>arr[i])
	        {
	            length++;
	        }
	        else {
	            count+=(length*(length-1))/2;
	            length=1;
	        }
	        
	    }
	    if(length>1)
	    count+=(length*(length-1))/2;
	    System.out.println(count);
	}
	
	    
	}
}
