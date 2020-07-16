class Solution
{
    // Complete the function
    public static int immediateSmaller(int arr[], int n, int x)
    {
        
{
  int max=(int)-1e6;
 for(int i=0;i<n;i++)
 {
     if(arr[i]<x)
     max=Math.max(arr[i],max);
 }
    return max!=(int)-1e6?max:-1;
}
    }
}
