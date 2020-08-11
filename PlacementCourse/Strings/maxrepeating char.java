class MaxOccur{
    
    // Function to get maximum occuring 
    // character in given string str
    public static char getMaxOccuringChar(String line){
         
            int []map=new int[26];
            for(int i=0;i<line.length();i++)
           { char ch = line.charAt(i);
               map[ch-'a']++;       }
    char ans='\0';
    int maxlength=(int)-1e6;
    for(int i=0;i<map.length;i++)
    {
        if (map[i]>maxlength)
         { maxlength=map[i];
             ans=(char)(i+'a'); }
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
    }
    return ans;
    }