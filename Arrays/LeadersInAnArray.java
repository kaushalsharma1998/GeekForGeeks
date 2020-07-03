/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int flag = 0;
		
		for(int i=0;i<n;i++)
		{
		    int x = Integer.parseInt(br.readLine());
		    int[] a = new int[x];
		    StringBuilder sb = new StringBuilder();
		    List<Integer> list = new ArrayList<Integer>();
		    
		    String line = br.readLine(); 
			String[] strs = line.trim().split("\\s+"); 

			// array elements input 
			for (int j = 0; j < strs.length; j++) 
				a[j] = Integer.parseInt(strs[j]);
		    
		    int leader = a[x-1];
		    list.add(leader);
		    //System.out.print(leader + " ");
		    
		    for(int j=x-2;j>=0;j--)
		    {
		        if(a[j]>=leader)
		        {
		            list.add(a[j]);
		            leader = a[j];
		        }
		    }
		    
		    for(int j=list.size()-1;j>=0;j--)
		    {
		        sb.append(list.get(j));
		        sb.append(' ');
		    }
		    System.out.print(sb);
		    System.out.println();
		}
	}
}
