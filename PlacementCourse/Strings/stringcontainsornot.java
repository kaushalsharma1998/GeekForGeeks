class GfG
{
    int strstr(String str, String target)
    {
        
        //return str.indexOf(target);
      int i=0,j=0;
      while(i<str.length())
      {
          if(i<str.length()&&j<target.length()&&str.charAt(i)==target.charAt(j))
          {   i++;
              j++;
              if(j==target.length())
              return i-j;
          }
        //  else if(i<str.length()&&str.charAt(i)==target.charAt(0))
        //  {
        //      j=0;
        //     j++;
        //     i++;
        //  }
         else if(j==target.length())
         return i-j;
         
         
          else 
          {
              j=0;
              i++;
          }
      }
    
return -1;        
    }
}