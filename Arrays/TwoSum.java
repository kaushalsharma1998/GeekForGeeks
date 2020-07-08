/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)    throws IOException{
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
            int sum= Integer.parseInt(sti.nextToken());
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (  int i = 0 ; i < n ; i++) 
            arr[i]= Integer.parseInt(st.nextToken());  
	
	        HashSet<Integer>set=new HashSet<>();
	        boolean f=false;
	        for( int a: arr)
	        {
	            if(set.contains(sum-a))
	            {f=true;break;}
	            set.add(a);
	        }
	        if(f)
	        System.out.println("Yes");
	        else 
	        System.out.println("No");
	    }
	    
	        
	        
	    
	    
	}
	
    
}
