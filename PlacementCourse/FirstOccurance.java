int transitionPoint(int arr[], int n) {
 int i=0,j=n-1; 
 if(arr[0]==1)
 return 0;
 int res=0;
 while(i<=j)
 {  int mid=i+((j-i)/2);
     if(arr[mid]==1)
    {res=mid;
    
        j=mid-1;
    }
     
     else if(arr[mid]==0)
     i=mid+1;
     
      
     
 }
 if(arr[j+1]==1)
 return j+1;
 else 
 return -1;
}