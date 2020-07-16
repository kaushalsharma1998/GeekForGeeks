class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer>res=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            arr[arr[i]%n]=arr[arr[i]%n]+n;
        }
        for( int i =0;i<n;i++)
        {
            if(arr[i]>=2*n)
            {
                res.add(i);
            }
        }
         
        if(res.size()==0)
        res.add(-1);
        return res;
        
        