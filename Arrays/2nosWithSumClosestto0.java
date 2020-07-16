/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int t = Integer.parseInt(br.readLine());
  while (t--> 0) {
    String s = br.readLine();
  
    int n = Integer.parseInt(s);
  
    String A = br.readLine();
    String A1[] = A.split(" ");
	int arr[]=new int[n];
    for (int i = 0; i < n; i++) 
    arr[i] =(Integer.parseInt(A1[i]));
      
        Arrays.sort(arr);
    int l=0;
     int r=n-1;
    int min_sum=(int)1e6,sum=0,min_l = l, min_r = n-1; 
    while(l<r)
    {  
         sum = arr[l] + arr[r]; 
       
        /*If abs(sum) is less then update the result items*/
        if(Math.abs(sum) < Math.abs(min_sum)) 
        { 
          min_sum = sum; 
          min_l = l; 
          min_r = r; 
        } 
          if(sum < 0) 
          l++; 
        else
          r--; 
    }
  
    System.out.println(arr[min_l]+arr[min_r]);
  }
 
  
  
	    
	}
}