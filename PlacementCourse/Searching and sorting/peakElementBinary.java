class Peak
{
	// Function to find the peak element
	// a[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
         // first or last element is peak element 
    if (n == 1)  
      return arr[0]; 
    if (arr[0] >= arr[1]) 
        return 0; 
    if (arr[n - 1] >= arr[n - 2]) 
        return n - 1; 
      int left =0;
      int right=n-1;
      while(left<=right)
      {
           int mid=left-(left-right)/2;
           if(arr[mid]>arr[mid+1]&&arr[mid]>arr[mid-1])
           return mid;
           if(arr[mid]<arr[mid+1])
           left=mid+1;
           else 
           right=mid-1;
      }
      return 0;
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
    }
}