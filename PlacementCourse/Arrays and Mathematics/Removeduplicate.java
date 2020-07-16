class GfG
{
        /*You are required to complete this function */
	int remove_duplicate(int arr[], int n)
	{ int counter=0;
		
		for(int i=1;i<n;i++)
		{
		    if(arr[i]!=arr[counter])
		    { counter++;
		      arr[counter]=arr[i];
		      
		    }
		   
		    
		}
		return counter+1;
	}
}
