
class Solution 
{ 
	static boolean search(int arr[][], int n, int m, int x) 
	{  
	           int i=0, j=m-1;
	           while(i<n&&j>=0)
	           {if(x==arr[i][j])
	           return true;
	           if(x>arr[i][j])
	           i++;
	           else
	           j--;
	           }
	           return false;
	           
	}
} 