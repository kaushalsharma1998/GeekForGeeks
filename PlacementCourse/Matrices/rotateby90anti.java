class Solution{
    static void rotateby90(int arr[][], int n) 
    { 
        

     for(int i=0;i<n;i++)
     {
         for(int j=i+1;j<n;j++)
         {
             int temp=arr[i][j];
             arr[i][j]=arr[j][i];
             arr[j][i]=temp;
         }
     }
     
     for(int i=0;i<n/2;i++)
     {
         for(int j=0;j<n;j++)
         {
            int temp=arr[i][j];
            arr[i][j]=arr[n-1-i][j];
            arr[n-1-i][j]=temp;
         }
         
     }
    }
}