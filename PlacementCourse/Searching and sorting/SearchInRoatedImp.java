 3 4 5 1 2  LOW=0 Hhigh =5-1; mid= 0+4/2=2

class Solution 
{ 
    static int Search(int nums[], int x)
	{
        int n=nums.length;
        int index=-1;
        int l=0,r=n-1;
        int mid;
        while(l<=r){
            mid=(l+r)/2;
            //mid is pointing to element
            if(nums[mid]==x){
                index=mid;
                break;
            }
            //if target is smaller than than the mid element move left/right?
            //lets find pivot direction first
            if(nums[mid]>=nums[0]){
                //right side is my pivot
                if(x>=nums[0] && x<nums[mid])
                    r=mid-1;
                else
                    l=mid+1;
            }
            else{
                if(x>nums[mid] && x<=nums[n-1])
                    l=mid+1;
                else
                    r=mid-1;
            }
        }
        return index;
	}
} 

 			