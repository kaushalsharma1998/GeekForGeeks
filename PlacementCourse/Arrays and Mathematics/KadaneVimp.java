class Kadane{
    
    // Function to find subarray with maximum sum
    // arr: input array
    // n: size of array
    int maxSubarraySum(int nums[], int n){
     int cmax=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++)
        {  cmax=Math.max(nums[i],cmax+nums[i]);
            max=Math.max(max,cmax);
        }
    return max;



        
    }
    
}