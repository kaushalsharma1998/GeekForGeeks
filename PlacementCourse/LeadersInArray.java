static ArrayList<Integer> leaders(int arr[], int n){
        
        // Your code here
        
        
        /******************
     * You just need to complete this
     * function and return the vector
     * containing the leaders.
     * ***************/
     LinkedList<Integer>res=new LinkedList<>();
     int leader=arr[n-1];
     res.addFirst(leader);
     
     for(int i=n-2;i>=0;i--)
     {
         if(arr[i]>=leader)
         {  leader=arr[i];
             res.addFirst(arr[i]);
         }
         
     }
     return new ArrayList(res);
     
    }
    
}
