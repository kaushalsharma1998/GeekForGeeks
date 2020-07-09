/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;


class GFG {
 public static void main(String[] args) throws IOException {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int t = Integer.parseInt(br.readLine());
  while (t--> 0) {
   String s = br.readLine();
   String s1[] = s.split(" ");
   int n = Integer.parseInt(s1[0]);
   int m = Integer.parseInt(s1[1]);
   String A = br.readLine();
   String A1[] = A.split(" ");
   long a[] = new long[n];
   long b[] = new long[m];


   for (int i = 0; i < n; i++) 
   a[i] =(Long.parseLong(A1[i]));
  String  B = br.readLine();
 String  b1[] = B.split(" ");
 for (int i =0;i<m;i++)
  b[i] = (Long.parseLong(b1[i])); 
 Set < Long > cset = new LinkedHashSet < Long > ();
 for (int i = 0; i < m; i++) cset.add(b[i]);
 for (int  i = 0;i<n;i++) {
   
   if (cset.contains(a[i]) == false)  {
    
    System.out.print(a[i] + " ");
   } 
  } 
  System.out.println();
 } 
} 
}
