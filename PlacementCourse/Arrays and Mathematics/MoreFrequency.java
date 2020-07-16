class Solution
{   static void rev(int arr[],int i,int j)
    {while(i<j)
    {
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
        i++;
        j--;
    }
    }
    static void rotateArr(int arr[], int d, int n)
    {d=d%n;
        rev(arr,0,d-1);
        rev(arr,d,n-1);
        rev(arr,0,n-1);
        
    
    
        
    }
}