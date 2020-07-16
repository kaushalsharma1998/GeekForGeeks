class Union
{
    
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {   ArrayList<Integer>res=new ArrayList<>();
    int  i=0; int j=0;
        while(i<n&&j<m)
        {   if(i>0)
            if(arr1[i-1]==arr1[i]){i++;continue;}
            if(j>0)
            if(arr2[j-1]==arr2[j]){j++;continue;}
            if(arr1[i]==arr2[j])
            {    res.add(arr1[i]);
                i++;j++;
                
            }
            else if((arr1[i]>arr2[j]))
            {
                 res.add(arr2[j]);
                 j++;
            }
            else
             res.add(arr1[i++]);
        }
        while(i<n){
            if(i>0)
            if(arr1[i-1]==arr1[i]){i++;continue;}
            
         res.add(arr1[i++]);}
         while(j<m){
         if(j>0)
            if(arr2[j-1]==arr2[j]){j++;continue;}
         res.add(arr2[j++]);}
         return res;
    }
}



