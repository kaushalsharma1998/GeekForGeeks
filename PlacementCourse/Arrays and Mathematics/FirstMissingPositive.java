class FindMissing{
    
    // Function to find 
    static int findMissing(int arr[], int size)
    {
         int j=1;
   
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==j)
            { //System.out.println(arr[i] +" "+ i +" "+ j);
              j++;
            i=-1;
             //System.out.println(arr[i] +" "+ i+" "+j);
            }
            else
            {
                if(i+1==arr.length)
                { //System.out.println(arr[i] +" "+ i+" "+j);
                    return j;}
            }
        }
    return 1;

       
    }
}