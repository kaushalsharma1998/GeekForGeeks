class Intersection
{
    /* Function prints Intersection of arr1[] and arr2[] 
    n is the number of elements in arr1[] 
    m is the number of elements in arr2[] 
    Return the array
    */
    static ArrayList<Integer> printIntersection(int arr1[], int arr2[], int n, int m) 
    { int i=0;int j=0;
    ArrayList<Integer>res=new ArrayList<>();
      ArrayList<Integer>pes=new ArrayList<>();
      pes.add(-1);
      while(i<n&&j<m)
      {    if(i>0)
            if(arr1[i-1]==arr1[i]){i++;continue;}
            if(j>0)
            if(arr2[j-1]==arr2[j]){j++;continue;}
          if(arr1[i]==arr2[j])
            {   res.add(arr2[j]);
                i++;j++;
                
            }
            else if((arr1[i]>arr2[j]))
            {
                
                 j++;
            }
            else
            i++;
      }
      
    
         return res.size()>0?res:pes;
        
    }

}

