/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException  {
		//code
	
	             // Using BufferedReader class to take input 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        // taking input of number of testcase 
        int t = Integer.parseInt(br.readLine()); 
	    while(t-->0)
	    {
	        
	        StringTokenizer sti = new StringTokenizer(br.readLine());
int n = Integer.parseInt(sti.nextToken());
int[] arr = new int[n];

StringTokenizer st = new StringTokenizer(br.readLine());

for (  int i = 0 ; i < n ; i++) 
arr[i]= Integer.parseInt(st.nextToken());  
	     int left=0,right=n-1;
	        while(left<right)
	        {   
	            if(arr[left]==0)
	            left++;
	            if(arr[left]==1)
	            {
	                int temp =arr[left];
	                arr[left]=arr[right];
	                arr[right]=temp;
	                right--;
	            }
	        }
	        StringBuffer sb = new StringBuffer(); 
            for (int i = 0; i < n; i++) 
                sb.append(arr[i] + " "); 
  
            // finally printing the string 
            System.out.println(sb); 
	    }
	}
}