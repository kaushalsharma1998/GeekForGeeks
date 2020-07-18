void sort012(int nums[], int n)
{
     int left = 0, right = nums.size()-1, i=0;
        while(i <= right){
            if(nums[i] == 2)      swap(nums[i], nums[right--]);
            else if(nums[i] == 0) swap(nums[i++], nums[left++]);
            else i++;
        }
