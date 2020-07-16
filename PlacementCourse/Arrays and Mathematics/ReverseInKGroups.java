class Reverse{
    
    // Function to reverse array in group of k 
    public static ArrayList<Integer> reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // add your code here
        
       
        for(int i=0;i<n;i=i+k)
        {
            
        int left=i;
         int right=Math.min(i+k-1,n-1);
        while(left<right)
        
        { int temp=arr.get(right);
            arr.set(right,arr.get(left));
            arr.set(left,temp);
            left++;
            right--;
        }
       
        
            
        }
            
        return arr;
        
    }
    
}

