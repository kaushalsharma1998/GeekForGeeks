

class Solution {
    int minDist(int arr[], int n, int x, int y) {
        int prev=-1;
        int mindist=(int)1e6;
        for (int i=0;i<arr.length;i++ )
        {
            if(arr[i]==x||arr[i]==y)
            {
                if(prev!=-1 && arr[i]!=arr[prev])
              
                mindist = Math.min(mindist,i-prev); 
               
                prev=i;
            }
            
        }
         if(mindist== (int)1e6) 
       return -1; 
    return mindist; 
    }
}
