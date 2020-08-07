class Solution {

    public boolean isValidIP(String s) {
        String arr[]=s.split("\\.",-1);
        //System.out.println(Arrays.toString(arr));
        if(arr.length!=4)
        return false;
       
        for(String str:arr)
        {  //System.out.println(str.charAt(0));
            
            if(str.length()==0)
            return false;
             try {
                    int value = Integer.parseInt(str);
                    // check value is in range 0-255
                    if (value < 0 ||
                        value > 255)
                        return false;
                } catch (NumberFormatException e) {
                    return false;
                }
            if(str.charAt(0)=='0'&&str.length()>1)
            return false;
            
           
        }
        return true;
        
    }
}