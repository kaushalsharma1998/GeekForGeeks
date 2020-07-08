/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
		//code
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        // taking input of number of testcase 
        int t = Integer.parseInt(br.readLine()); 
	    while(t-->0)
	    {
	        
	        
	        StringTokenizer sti = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(sti.nextToken());
            int[] arr = new int[n];
           // int sum= Integer.parseInt(sti.nextToken());
            StringTokenizer st = new StringTokenizer(br.readLine());
            boolean vis[]=new boolean[100];
            for (  int i = 0 ; i < n ; i++) 
            {
                arr[i]= Integer.parseInt(st.nextToken());  
                if(arr[i]<100&&arr[i]>=0)
                vis[arr[i]]=true;
                
            }
            if(n==1)
            
            //StringBuilder sb=new StringBuilder();
            for(int i=0;i<100;i++)
	        { if(vis[i]==false)
	        {
	            int j=i+1;
	            while(j<100&&vis[j]==false)
	            j++;
	            int p=j-1;
	           System.out.print(i+1==j ? i +" ": i + "-" + p+" "); 
	            i=j;
	        }
	            System.out.println();
	        }
	        
	    
	        
	    }
	}
}