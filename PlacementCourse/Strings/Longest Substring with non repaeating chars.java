class Solution
{
    

    int SubsequenceLength(String s) 
    {
       HashSet<Character>map=new HashSet<Character>();
       int ptr1=0,ptr2=0,max=0;
       while(ptr2<s.length())
       {
        if(!map.contains(s.charAt(ptr2)))
        {
            map.add(s.charAt(ptr2));
            max=Math.max(map.size(),max);
            ptr2++;
        }
        else 
        {
            map.remove(s.charAt(ptr1));
            ptr1++;
        }
           
       }
       
    return max;
        
    }
    
}

