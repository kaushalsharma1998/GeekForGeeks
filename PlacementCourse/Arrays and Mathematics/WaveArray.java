void convertToWave(int *arr, int n){
    
    // Your code here
    for(int i=1;i<n;i=i+2)
    { int temp=arr[i-1];
    
        arr[i-1]=arr[i];
        arr[i]=temp;
        
    }
    
}