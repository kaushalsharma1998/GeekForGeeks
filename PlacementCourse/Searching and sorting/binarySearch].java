int bin_search(int arr[], int left, int right, int k)
{
 while(left<=right)
 {
     int mid=left-((left-right)/2);
     if(arr[mid]==k)
     return mid;
     else if(k>arr[mid])
     left=mid+1;
     else 
     right=mid-1;
     
     
 }
 return -1;
}